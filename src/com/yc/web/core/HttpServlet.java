package com.yc.web.core;

import com.yc.tomcat.core.TomcatConstants;

public class HttpServlet implements Servlet{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) {
		// TODO Auto-generated method stub
		switch(request.getMethod()) {
		case TomcatConstants.REQUEST_METHOD_GET: doGet(request, response); break;
		case TomcatConstants.REQUEST_METHOD_POST: doPost(request, response); break;
		}
	}

	@Override
	public void doGet(ServletRequest request, ServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doPost(ServletRequest request, ServletResponse response) {
		// TODO Auto-generated method stub
		
	}

}
