package com.lambda.bookstore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@Profile("lambda")
@EnableWebMvc
public class Config {
	
	@Bean
	public HandlerMapping handlerMapping() {
		return new RequestMappingHandlerMapping();
	}
	
	@Bean
	public HandlerAdapter handlerAdapter() {
		return new RequestMappingHandlerAdapter();
	}
	
	@Bean
	public HandlerExceptionResolver handlerExceptionResolver() {
		return new HandlerExceptionResolver() {
			
			@Override
			public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
					Exception arg3) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
	
}
