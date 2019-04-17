package com.fapai.mvc.picupcar;

import com.platform.annotation.Controller;
import com.platform.constant.ConstantInit;
import com.platform.mvc.base.BaseController;
import com.platform.mvc.base.BaseModel;

import com.jfinal.log.Log;
import com.jfinal.aop.Before;

/**
 * XXX 管理	
 * 描述：
 * 
 * /fapai/picUpCar
 * /fapai/picUpCar/save
 * /fapai/picUpCar/edit
 * /fapai/picUpCar/update
 * /fapai/picUpCar/view
 * /fapai/picUpCar/delete
 * /common/picUpCar/add.html
 * 
 */
@Controller("/yhfp/picUpCar")
public class PicUpCarController extends BaseController {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(PicUpCarController.class);
	
	private PicUpCarService picUpCarService;
	
	/**
	 * 列表
	 */
	public void index() {
		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPageSelect, PicUpCar.sqlId_splitPageFrom);
		render("/fapai/picUpCar/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(PicUpCarValidator.class)
	public void save() {
		getModel(PicUpCar.class).saveRandomId();
		forwardAction("/fapai/picUpCar/backOff");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		PicUpCar picUpCar = PicUpCar.dao.findById(getPara());
		setAttr("picUpCar", picUpCar);
		render("/fapai/picUpCar/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(PicUpCarValidator.class)
	public void update() {
		getModel(PicUpCar.class).update();
		forwardAction("/fapai/picUpCar/backOff");
	}

	/**
	 * 查看
	 */
	public void view() {
		PicUpCar picUpCar = PicUpCar.dao.findById(getPara());
		setAttr("picUpCar", picUpCar);
		render("/fapai/picUpCar/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		picUpCarService.baseDelete(PicUpCar.table_name, getPara() == null ? ids : getPara());
		forwardAction("/fapai/picUpCar/backOff");
	}
	
}
