package com.accolite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class UserServiceApplication {  // user service app 

	public static void main(String[] args) {  // main app
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Bean
	public Docket api() {   /*scan base package*/
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.accolite.controller")).build();
	}

	

}
