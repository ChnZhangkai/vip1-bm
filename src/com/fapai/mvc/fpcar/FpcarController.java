package com.fapai.mvc.fpcar;

import com.platform.annotation.Controller;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.base.BaseModel;
import com.platform.mvc.upload.UploadController;
import com.platform.tools.ToolWeb;
import com.jfinal.log.Log;

import java.io.File;
import java.util.List;

import com.fapai.mvc.picupcar.PicUpCar;
import com.jfinal.aop.Before;

/**
 * XXX 管理	
 * 描述：
 * 
 * /fapai/fpcar
 * /fapai/fpcar/save
 * /fapai/fpcar/edit
 * /fapai/fpcar/update
 * /fapai/fpcar/view
 * /fapai/fpcar/delete
 * /common/fpcar/add.html
 * 
 */
@Controller("/yhfp/fpcar")
public class FpcarController extends BaseController {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(FpcarController.class);
	
	private FpcarService fpcarService;
	
	/**
	 * 列表
	 */
	public void index() {
		splitPage.setOrderColunm("modify_time");
		splitPage.setOrderMode("desc");
		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPageSelect, Fpcar.sqlId_splitPageFrom);
		render("/fapai/fpcar/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(FpcarValidator.class)
	public void save() {
		
		String fileids[] =getParas("fileids");
		String fileindex[] =getParas("fileindex");
		Fpcar fpcar=getModel(Fpcar.class);
		fpcar.setIs_delete(0);
		fpcar.saveRandomId();
		fpcarService.saveImage(fileids,fileindex,fpcar);
		forwardAction("/fapai/fpcar/backOff");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		Fpcar fpcar = Fpcar.dao.findById(getPara());
		List<PicUpCar> picList =  fpcarService.getImage(fpcar);
		// Fpcar.dao.find(sql)
		setAttr("fpcar", fpcar);
		setAttr("fileList", picList);
		if("path".equals(UploadController.pathType)) {
			setAttr("piccontext", UploadController.PICCONTEXT);
		}else {
			setAttr("piccontext", ToolWeb.getContextPath(getRequest()));
		}
		render("/fapai/fpcar/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(FpcarValidator.class)
	public void update() {
		Fpcar fpcar=getModel(Fpcar.class);
		fpcar.update();
		String isupdateImge =getPara("isupdateImge");
		if("true".equals(isupdateImge)) {
			String fileids[] =getParas("fileids");
			String fileindex[] =getParas("fileindex");
			fpcarService.deleteImage(fpcar);
			fpcarService.saveImage(fileids,fileindex,fpcar);
		}
		
		forwardAction("/fapai/fpcar/backOff");
	}

	/**
	 * 查看
	 */
	public void view() {
		Fpcar fpcar = Fpcar.dao.findById(getPara());
		List<PicUpCar> picList =  fpcarService.getImage(fpcar);
		// Fpcar.dao.find(sql)
		setAttr("fpcar", fpcar);
		setAttr("fileList", picList);
		if("path".equals(UploadController.pathType)) {
			setAttr("piccontext", UploadController.PICCONTEXT);
		}else {
			setAttr("piccontext", ToolWeb.getContextPath(getRequest()));
		}
		render("/fapai/fpcar/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		//fpcarService.baseDelete(Fpcar.table_name, getPara() == null ? ids : getPara());
		Fpcar fpcar = Fpcar.dao.findById(getPara() == null ? ids : getPara());
		fpcar.setIs_delete(1);
		fpcar.update();
		forwardAction("/fapai/fpcar/backOff");
	}
	/**
	 * 上下架
	 */
	public void shelves(){
		String ids = getPara("ids");
		String type = getPara("type");
		boolean bool = fpcarService.shelves(ids, type);
		renderText(String.valueOf(bool));
	}
	
}
