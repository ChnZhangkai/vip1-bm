package com.fapai.mvc.fphouse;

import java.io.File;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fapai.mvc.fpcar.Fpcar;
import com.fapai.mvc.picuphouse.PicUpHouse;
import com.jfinal.log.Log;
import com.jfinal.plugin.activerecord.Db;
import com.platform.annotation.Service;

import com.platform.mvc.base.BaseService;
import com.platform.mvc.upload.Upload;
import com.platform.mvc.upload.UploadController;

@Service(name = FphouseService.serviceName)
public class FphouseService extends BaseService {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(FphouseService.class);
	
	public static final String serviceName = "fphouseService";

	public void saveImage(String[] fileids, String[] fileindex, Fphouse fphouse) {
		// TODO Auto-generated method stub
		for (int i = 0; i < fileids.length; i++) {
			String fileid=fileids[i];
			Upload upload = Upload.dao.findById(fileid);
			if(upload!=null){
				PicUpHouse pic=new PicUpHouse();
				pic.set("id_house", fphouse.getIds());
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

	public List<PicUpHouse> getImage(Fphouse fphouse) {
		String sql = getSqlMy(PicUpHouse.sqlId_selectAll);
		return PicUpHouse.dao.find(sql,fphouse.getIds());
	}

	public void deleteImage(Fphouse fphouse) {
		// TODO Auto-generated method stub
		String sql = getSqlMy(PicUpHouse.sqlId_deleteById);
		Db.update(sql, fphouse.getIds());
		//List<PicUpHouse> list=PicUpHouse.dao.find(sql,fphouse.getIds());
//		Db.update(sql, paras);
//		for (PicUpHouse picUpHouse : list) {
//			picUpHouse.delete();
//		}
	}

	public boolean shelves(String ids, String type) {
		// TODO Auto-generated method stub
		Fphouse fphouse = Fphouse.dao.findById(ids);
		if(fphouse!=null) {
			if("0".equals(type)) {
				fphouse.setShelves_status(0);
			}else if("1".equals(type)){
				fphouse.setShelves_status(1);
			}
			return fphouse.update();
		}else {
			return false;
		}
	}
	
}
