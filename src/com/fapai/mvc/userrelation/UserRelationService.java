package com.fapai.mvc.userrelation;

import com.jfinal.log.Log;

import com.platform.annotation.Service;

import com.platform.mvc.base.BaseService;

@Service(name = UserRelationService.serviceName)
public class UserRelationService extends BaseService {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(UserRelationService.class);
	
	public static final String serviceName = "userRelationService";
	
}
