package com.thoughtworks.config;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author: Jiang Yuzhou
 * @DateTime: 2020/7/12 20:11
 * @Description: TODO
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{DispatcherServlet.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
