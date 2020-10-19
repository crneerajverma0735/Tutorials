package com.neeraj.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{
		
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object Handler)throws Exception {
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK); // getting a day on which request is made
		if(dayOfWeek == 1) { // 1 means Sunday, 2 means Monday..... 7 means Saturday
			response.getWriter().write("This Website is closed on sunday; please try "+
					"accessing it on any other week day!!");
			return false;
		}
		
		return true;
	}
	
	/*@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("HandlerInterceptorAdaptor : Spring MVC called postHandle method for "
							+ request.getRequestURL().toString());
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,
			Object handler,Exception ex)throws Exception {
	
		System.out.println("HandlerInterceptorAdaptor : Spring MVC called afterCompletion method for "
				+ request.getRequestURL().toString());
	}*/
	
}
