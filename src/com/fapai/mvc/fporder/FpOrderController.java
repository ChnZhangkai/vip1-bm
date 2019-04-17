package com.fapai.mvc.fporder;

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
 * /fapai/fpOrder
 * /fapai/fpOrder/save
 * /fapai/fpOrder/edit
 * /fapai/fpOrder/update
 * /fapai/fpOrder/view
 * /fapai/fpOrder/delete
 * /common/fpOrder/add.html
 * 
 */
@Controller("/yhfp/fpOrder")
public class FpOrderController extends BaseController {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(FpOrderController.class);
	
	private FpOrderService fpOrderService;
	
	/**
	 * 列表
	 */
	public void index() {
		paging(ConstantInit.db_dataSource_main, splitPage, BaseModel.sqlId_splitPageSelect, FpOrder.sqlId_splitPageFrom);
		render("/fapai/fpOrder/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(FpOrderValidator.class)
	public void save() {
		getModel(FpOrder.class).save();
		forwardAction("/fapai/fpOrder/backOff");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		FpOrder fpOrder = FpOrder.dao.findById(getPara());
		setAttr("fpOrder", fpOrder);
		render("/fapai/fpOrder/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(FpOrderValidator.class)
	public void update() {
		getModel(FpOrder.class).update();
		forwardAction("/fapai/fpOrder/backOff");
	}

	/**
	 * 查看
	 */
	public void view() {
		FpOrder fpOrder = FpOrder.dao.findById(getPara());
		setAttr("fpOrder", fpOrder);
		render("/fapai/fpOrder/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		fpOrderService.baseDelete(FpOrder.table_name, getPara() == null ? ids : getPara());
		forwardAction("/fapai/fpOrder/backOff");
	}
	
}
