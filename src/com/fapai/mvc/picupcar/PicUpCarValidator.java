package com.fapai.mvc.picupcar;

import com.jfinal.log.Log;
import com.jfinal.core.Controller;

import com.platform.mvc.base.BaseValidator;

public class PicUpCarValidator extends BaseValidator {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(PicUpCarValidator.class);
	
	@SuppressWarnings("unused")
	private PicUpCarService picUpCarService;
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/fapai/picUpCar/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/fapai/picUpCar/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(PicUpCar.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/fapai/picUpCar/save")){
			controller.render("/fapai/xxx.html");
		
		} else if (actionKey.equals("/fapai/picUpCar/update")){
			controller.render("/fapai/xxx.html");
		
		}
	}
	
}
