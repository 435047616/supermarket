package com.smbms.util;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SysInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();

		String uri=request.getRequestURI();
		if(uri.contains("/sys/billadd/lejian")){
			//乐荐传递的数据接口路径不需要拦截，
			return true;

		}

		Object obj=session.getAttribute("userOnLogin");
		if(obj==null){
			String path=request.getContextPath();
			session.setAttribute("error", "未登录，请先登录");
			response.sendRedirect(path+"/login");
			return false;
		}
		return true;
	}
}
