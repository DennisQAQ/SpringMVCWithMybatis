package com.dw.config;

import com.dw.controller.interceptor.ProjectInterceptot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(value = {"com.dw.controller","com.dw.config"})
@EnableWebMvc
public class SpringMVCConfig {

}
//public class SpringMVCConfig implements WebMvcConfigurer {
//    @Autowired
//    private ProjectInterceptot ProjectInterceptot ;
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(ProjectInterceptot).addPathPatterns("/books");
//    }
//
//}
