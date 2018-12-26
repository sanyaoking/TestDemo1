package com.mengchaob.testDemo.freemarker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/**
 * @Auther: mengchao
 * @Date: 2018-12-25 21:52
 * @Description:
 * @Version 1.0
 * @ClassName ConfigView
 */
@Configuration
public class ConfigFMView {

    @Bean
    FreeMarkerViewResolver getFreemarkerViewResolver(){
        final FreeMarkerViewResolver fmvr = new FreeMarkerViewResolver();
        fmvr.setPrefix("");
        fmvr.setSuffix(".ftl");
        fmvr.setOrder(1);
        //修正ftl页面中文乱码问题
        fmvr.setContentType("text/html;charset=UTF-8");
        return fmvr;
    }

}
