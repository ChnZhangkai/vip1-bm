package com.fapai.mvc.userconsult;

import com.jfinal.log.Log;
import com.jfinal.core.Controller;

import com.platform.mvc.base.BaseValidator;

public class UserConsultValidator extends BaseValidator {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(UserConsultValidator.class);
	
	@SuppressWarnings("unused")
	private UserConsultService userConsultService;
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/fapai/userConsult/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/fapai/userConsult/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(UserConsult.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/fapai/userConsult/save")){
			controller.render("/fapai/xxx.html");
		
		} else if (actionKey.equals("/fapai/userConsult/update")){
			controller.render("/fapai/xxx.html");
		
		}
	}
	
}
