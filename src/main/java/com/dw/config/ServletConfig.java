package com.dw.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    //此方法加载SpringConfig.class核心配置类
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //此方法加载SpringMVCConfig.class配置类
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }
    //拦截所有请求
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
