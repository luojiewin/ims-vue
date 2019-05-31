package com.roger.ims.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns(
				"classpath:/static/");
		
		WebMvcConfigurer.super.addInterceptors(registry);
		
	}

	

}
