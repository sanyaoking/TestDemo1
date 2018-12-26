package com.mengchaob.testDemo.thymleaf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.spring5.view.reactive.ThymeleafReactiveViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;

/**
 * @Auther: mengchao
 * @Date: 2018-12-25 21:52
 * @Description:
 * @Version 1.0
 * @ClassName ConfigView
 */
@Configuration
public class ConfigThymleafView {
    @Bean
    ThymeleafViewResolver getthymLeafViewResolver(SpringTemplateEngine stle){
        final ThymeleafViewResolver trvr = new ThymeleafViewResolver();
        trvr.setOrder(0);
        trvr.setTemplateEngine(stle);
        return trvr;
    }
}
