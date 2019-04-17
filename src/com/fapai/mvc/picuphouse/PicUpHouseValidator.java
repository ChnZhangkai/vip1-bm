package com.fapai.mvc.picuphouse;

import com.jfinal.log.Log;
import com.jfinal.core.Controller;

import com.platform.mvc.base.BaseValidator;

public class PicUpHouseValidator extends BaseValidator {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(PicUpHouseValidator.class);
	
	@SuppressWarnings("unused")
	private PicUpHouseService picUpHouseService;
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/fapai/picUpHouse/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/fapai/picUpHouse/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(PicUpHouse.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/fapai/picUpHouse/save")){
			controller.render("/fapai/xxx.html");
		
		} else if (actionKey.equals("/fapai/picUpHouse/update")){
			controller.render("/fapai/xxx.html");
		
		}
	}
	
}
