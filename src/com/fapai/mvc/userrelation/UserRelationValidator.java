package com.fapai.mvc.userrelation;

import com.jfinal.log.Log;
import com.jfinal.core.Controller;

import com.platform.mvc.base.BaseValidator;

public class UserRelationValidator extends BaseValidator {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(UserRelationValidator.class);
	
	@SuppressWarnings("unused")
	private UserRelationService userRelationService;
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/fapai/userRelation/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/fapai/userRelation/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(UserRelation.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/fapai/userRelation/save")){
			controller.render("/fapai/xxx.html");
		
		} else if (actionKey.equals("/fapai/userRelation/update")){
			controller.render("/fapai/xxx.html");
		
		}
	}
	
}
