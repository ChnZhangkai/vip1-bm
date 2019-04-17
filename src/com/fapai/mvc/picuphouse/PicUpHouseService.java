package com.fapai.mvc.picuphouse;

import com.jfinal.log.Log;

import com.platform.annotation.Service;

import com.platform.mvc.base.BaseService;

@Service(name = PicUpHouseService.serviceName)
public class PicUpHouseService extends BaseService {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(PicUpHouseService.class);
	
	public static final String serviceName = "picUpHouseService";
	
}
