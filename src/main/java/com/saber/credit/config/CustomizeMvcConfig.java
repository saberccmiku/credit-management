package com.saber.credit.config;

import com.saber.credit.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by saber on 2019/6/3
 * 基础配置类
 */
@Configuration
public class CustomizeMvcConfig implements WebMvcConfigurer {

    @Bean
    public WebMvcConfigurer webMvcConfigurer (){
        return new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
                registry.addViewController("/index.html").setViewName("login");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                //springBoot2.x.x以下静态资源不拦截 以上会拦截所以需要自己排除静态资源包括webjars
                .excludePathPatterns("/index.html","/","/user/login","/asserts/**","/vendors/**","/webjars/**");
            }
        };
    }

}
