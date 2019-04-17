package com.fapai.mvc.userrelation;

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
 * /fapai/userRelation
 * /fapai/userRelation/save
 * /fapai/userRelation/edit
 * /fapai/userRelation/update
 * /fapai/userRelation/view
 * /fapai/userRelation/delete
 * /common/userRelation/add.html
 * 
 */
@Controller("/fapai/userRelation")
public class UserRelationController extends BaseController {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(UserRelationController.class);
	
	private UserRelationService userRelationService;
	
	/**
	 * 列表
	 */
	public void index() {
		paging(ConstantInit.db_dataSource_main, splitPage, UserRelation.sqlId_splitPageSelect, UserRelation.sqlId_splitPageFrom);
		render("/fapai/userRelation/list.html");
	}
	
	/**
	 * 保存
	 */
	@Before(UserRelationValidator.class)
	public void save() {
		getModel(UserRelation.class).save();
		forwardAction("/fapai/userRelation/backOff");
	}
	
	/**
	 * 准备更新
	 */
	public void edit() {
		UserRelation userRelation = UserRelation.dao.findById(getPara());
		setAttr("userRelation", userRelation);
		render("/fapai/userRelation/update.html");
	}
	
	/**
	 * 更新
	 */
	@Before(UserRelationValidator.class)
	public void update() {
		getModel(UserRelation.class).update();
		forwardAction("/fapai/userRelation/backOff");
	}

	/**
	 * 查看
	 */
	public void view() {
		UserRelation userRelation = UserRelation.dao.findById(getPara());
		setAttr("userRelation", userRelation);
		render("/fapai/userRelation/view.html");
	}
	
	/**
	 * 删除
	 */
	public void delete() {
		userRelationService.baseDelete(UserRelation.table_name, getPara() == null ? ids : getPara());
		forwardAction("/fapai/userRelation/backOff");
	}
	
}
