package com.fapai.mvc.fporder;

import com.jfinal.log.Log;
import com.jfinal.core.Controller;

import com.platform.mvc.base.BaseValidator;

public class FpOrderValidator extends BaseValidator {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(FpOrderValidator.class);
	
	@SuppressWarnings("unused")
	private FpOrderService fpOrderService;
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/fapai/fpOrder/save")){
			// validateString("username", 6, 30, "usernameMsg", "请输入登录账号!");
			
		} else if (actionKey.equals("/fapai/fpOrder/update")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(FpOrder.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/fapai/fpOrder/save")){
			controller.render("/fapai/xxx.html");
		
		} else if (actionKey.equals("/fapai/fpOrder/update")){
			controller.render("/fapai/xxx.html");
		
		}
	}
	
}
