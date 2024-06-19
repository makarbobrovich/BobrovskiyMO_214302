package com.salesviz.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MVCConfig implements WebMvcConfigurer {
    @Value("${upload.css}")
    private String uploadCss;
    @Value("${upload.js}")
    private String uploadJs;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("file:" + uploadCss + "/");
        registry.addResourceHandler("/js/**").addResourceLocations("file:" + uploadJs + "/");
    }
}
