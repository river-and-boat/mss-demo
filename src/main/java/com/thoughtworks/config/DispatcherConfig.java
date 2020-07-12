package com.thoughtworks.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: Jiang Yuzhou
 * @DateTime: 2020/7/12 19:54
 * @Description: TODO
 */
@Configuration
@EnableWebMvc
public class DispatcherConfig implements WebMvcConfigurer {

    @Autowired
    private PropertiesConfig propertiesConfig;

    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp(propertiesConfig.getWebViewPrefix(),propertiesConfig.getWebViewSuffix());
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(propertiesConfig.getWebStaticHandler())
                .addResourceLocations(propertiesConfig.getWebStaticResource())
                .setCachePeriod(propertiesConfig.getWebStaticCachedPeriod());
    }
}
