package com.fapai.mvc.picupcar;

import com.jfinal.log.Log;

import com.platform.annotation.Service;

import com.platform.mvc.base.BaseService;

@Service(name = PicUpCarService.serviceName)
public class PicUpCarService extends BaseService {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(PicUpCarService.class);
	
	public static final String serviceName = "picUpCarService";
	
}
