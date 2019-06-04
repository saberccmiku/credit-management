package com.saber.credit.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by saber on 2019/6/4
 * 登录拦截器
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (null==loginUser){
            request.setAttribute("msg","没有权限请先登录");
            request.getRequestDispatcher("index.html").forward(request,response);
            return false;
        }else {
            return true;
        }
    }
}
