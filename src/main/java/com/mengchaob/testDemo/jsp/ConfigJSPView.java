package com.mengchaob.testDemo.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Auther: mengchao
 * @Date: 2018-12-25 21:52
 * @Description:
 * @Version 1.0
 * @ClassName ConfigView
 */
@Configuration
public class ConfigJSPView {
    @Value("${spring.mvc.view.prefix}")
    private String prefix;
    @Value("${spring.mvc.view.suffix}")
    private String suffix;
    @Value("${spring.mvc.view.order}")
    private int order;
    @Bean
    InternalResourceViewResolver getjspViewResolver(){
        final  InternalResourceViewResolver irvr = new InternalResourceViewResolver();
        irvr.setPrefix(prefix);
        irvr.setSuffix(suffix);
        irvr.setOrder(order);
        return irvr;
    }
}
