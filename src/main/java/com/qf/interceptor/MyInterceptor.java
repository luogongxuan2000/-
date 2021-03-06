package com.qf.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MyInterceptor implements HandlerInterceptor {

    //在controller调用之前先来执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        Object name = session.getAttribute("tel");
        if (name!=null){
            return true;
        }
        //根据不同的返回状态进行拦截 true 放行，false拦截
        request.getRequestDispatcher("/staticHTML/pagehome/login.html").forward(request,response);
        return false;
    }
    //在controller方法执行后执行

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }
    //在页面渲染后进行执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
