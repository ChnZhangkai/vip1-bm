package com.fapai.mvc.picuphouse;

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
 * /fapai/picUpHouse
 * /fapai/picUpHouse/save
 * /fapai/picUpHouse/edit
 * /fapai/picUpHouse/update
 * /fapai/picUpHouse/view
 * /fapai/picUpHouse/delete
 * /common/picUpHouse/add.html
 * 
 */
@Controller("/yhfp/picUpHouse")
public class PicUpHouseController extends BaseController {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(PicUpHouseController.class);
	
	private PicUpHouseService picUpHouseService;
	
	/**
	 * 列表
	 */
	public void index() {
		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPageSelect, PicUpHouse.sqlId_splitPageFrom);
		render("/fapai/picUpHouse/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(PicUpHouseValidator.class)
	public void save() {
		getModel(PicUpHouse.class).saveRandomId();
		forwardAction("/fapai/picUpHouse/backOff");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		PicUpHouse picUpHouse = PicUpHouse.dao.findById(getPara());
		setAttr("picUpHouse", picUpHouse);
		render("/fapai/picUpHouse/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(PicUpHouseValidator.class)
	public void update() {
		getModel(PicUpHouse.class).update();
		forwardAction("/fapai/picUpHouse/backOff");
	}

	/**
	 * 查看
	 */
	public void view() {
		PicUpHouse picUpHouse = PicUpHouse.dao.findById(getPara());
		setAttr("picUpHouse", picUpHouse);
		render("/fapai/picUpHouse/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		picUpHouseService.baseDelete(PicUpHouse.table_name, getPara() == null ? ids : getPara());
		forwardAction("/fapai/picUpHouse/backOff");
	}
	
}
