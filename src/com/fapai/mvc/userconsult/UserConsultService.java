package com.fapai.mvc.userconsult;

import com.jfinal.log.Log;

import com.platform.annotation.Service;

import com.platform.mvc.base.BaseService;

@Service(name = UserConsultService.serviceName)
public class UserConsultService extends BaseService {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(UserConsultService.class);
	
	public static final String serviceName = "userConsultService";
	
}
