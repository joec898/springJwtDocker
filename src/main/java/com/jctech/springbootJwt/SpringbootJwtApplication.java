package com.jctech.springbootJwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * 
 * bootstrap from: 
 * https://www.bezkoder.com/spring-boot-jwt-authentication/#google_vignette
 */

@PropertySource("classpath:application-${spring.profiles.active}.properties")
@SpringBootApplication
public class SpringbootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJwtApplication.class, args);
	}

}
