/*package com.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig
{
	@Bean
	public Docket createDocket()
	{
		return new Docket(DocumentationType.SWAGGER_2)//UI Screen type
				.select()//to specify rest controller
				.apis(RequestHandlerSelectors.basePackage("com.main.controller"))//base package for rest controller
				.paths(PathSelectors.regex("/plan-api.*"))//to specify request path
				.build();
	}

}
*/