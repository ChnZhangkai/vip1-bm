package com.fapai.mvc.fpcar;

import com.jfinal.log.Log;
import com.jfinal.core.Controller;

import com.platform.mvc.base.BaseValidator;

public class FpcarValidator extends BaseValidator {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(FpcarValidator.class);
	
	@SuppressWarnings("unused")
	private FpcarService fphouseService;
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/fapai/fphouse/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/fapai/fphouse/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Fpcar.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/fapai/fphouse/save")){
			controller.render("/fapai/xxx.html");
		
		} else if (actionKey.equals("/fapai/fphouse/update")){
			controller.render("/fapai/xxx.html");
		
		}
	}
	
}
