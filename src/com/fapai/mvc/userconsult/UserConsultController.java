package com.fapai.mvc.userconsult;

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
 * /fapai/userConsult
 * /fapai/userConsult/save
 * /fapai/userConsult/edit
 * /fapai/userConsult/update
 * /fapai/userConsult/view
 * /fapai/userConsult/delete
 * /common/userConsult/add.html
 * 
 */
@Controller("/fapai/userConsult")
public class UserConsultController extends BaseController {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(UserConsultController.class);
	
	private UserConsultService userConsultService;
	
	/**
	 * 列表
	 */
	public void index() {
		splitPage.setOrderColunm("subs_time");
		splitPage.setOrderMode("desc");
		paging(ConstantInit.db_dataSource_main, splitPage, UserConsult.sqlId_splitPageSelect, UserConsult.sqlId_splitPageFrom);
		render("/fapai/userConsult/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(UserConsultValidator.class)
	public void save() {
		getModel(UserConsult.class).save();
		forwardAction("/fapai/userConsult/backOff");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		UserConsult userConsult = UserConsult.dao.findById(getPara());
		setAttr("userConsult", userConsult);
		render("/fapai/userConsult/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(UserConsultValidator.class)
	public void update() {
		getModel(UserConsult.class).update();
		forwardAction("/fapai/userConsult/backOff");
	}

	/**
	 * 查看
	 */
	public void view() {
		UserConsult userConsult = UserConsult.dao.findById(getPara());
		setAttr("userConsult", userConsult);
		render("/fapai/userConsult/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		userConsultService.baseDelete(UserConsult.table_name, getPara() == null ? ids : getPara());
		forwardAction("/fapai/userConsult/backOff");
	}
	
}
