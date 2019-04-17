package com.fapai.mvc.fpcar;

import java.io.File;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fapai.mvc.picupcar.PicUpCar;
import com.jfinal.log.Log;
import com.jfinal.plugin.activerecord.Db;
import com.platform.annotation.Service;

import com.platform.mvc.base.BaseService;
import com.platform.mvc.upload.Upload;
import com.platform.mvc.upload.UploadController;

@Service(name = FpcarService.serviceName)
public class FpcarService extends BaseService {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(FpcarService.class);
	
	public static final String serviceName = "fpcarService";

	public void saveImage(String[] fileids, String[] fileindex, Fpcar fpcar) {
		// TODO Auto-generated method stub
		for (int i = 0; i < fileids.length; i++) {
			String fileid=fileids[i];
			Upload upload = Upload.dao.findById(fileid);
			if(upload!=null) {
				PicUpCar pic=new PicUpCar();
				pic.set("id_car", fpcar.getIds());
				pic.set("pic_type", 0);
				pic.set("pic_order", fileindex[i]);
				pic.set("pic_url", UploadController.path_root+File.separator+upload.get("filename"));
				pic.set("is_delete", 0);
				pic.setFileid(fileid);
				Date date=new Date();
				pic.setModify_time(new Timestamp(date.getTime()));
				pic.saveRandomId();
			}
		}
		
	}

	public List<PicUpCar> getImage(Fpcar fpcar) {
		String sql = getSqlMy(PicUpCar.sqlId_selectAll);
		return PicUpCar.dao.find(sql,fpcar.getIds());
	}

	public void deleteImage(Fpcar fpcar) {
		// TODO Auto-generated method stub
		String sql = getSqlMy(PicUpCar.sqlId_deleteById);
		Db.update(sql, fpcar.getIds());
		//List<PicUpcar> list=PicUpcar.dao.find(sql,fpcar.getIds());
//		Db.update(sql, paras);
//		for (PicUpcar picUpcar : list) {
//			picUpcar.delete();
//		}
	}

	public boolean shelves(String ids, String type) {
		Fpcar fpcar = Fpcar.dao.findById(ids);
		if(fpcar!=null) {
			if("0".equals(type)) {
				fpcar.setShelves_status(0);
			}else if("1".equals(type)){
				fpcar.setShelves_status(1);
			}
			return fpcar.update();
		}else {
			return false;
		}
		
	}
	
}
