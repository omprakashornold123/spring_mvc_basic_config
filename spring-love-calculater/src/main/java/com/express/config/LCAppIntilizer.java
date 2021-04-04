package com.express.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppIntilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		@SuppressWarnings("rawtypes")
		Class arr[]= {LoveCaluclaterAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[]= {"/load/*"};
		return arr;
	}

}
