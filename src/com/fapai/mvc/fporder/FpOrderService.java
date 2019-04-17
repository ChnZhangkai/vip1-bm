package com.fapai.mvc.fporder;

import com.jfinal.log.Log;

import com.platform.annotation.Service;

import com.platform.mvc.base.BaseService;

@Service(name = FpOrderService.serviceName)
public class FpOrderService extends BaseService {

	@SuppressWarnings("unused")
	private static final Log log = Log.getLog(FpOrderService.class);
	
	public static final String serviceName = "fpOrderService";
	
}
