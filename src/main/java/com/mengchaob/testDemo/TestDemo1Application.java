package com.mengchaob.testDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@EnableWebMvc
@ComponentScan("com.mengchaob.testDemo")
public class TestDemo1Application {


	public static void main(String[] args) {
		SpringApplication.run(TestDemo1Application.class, args);
	}

}

