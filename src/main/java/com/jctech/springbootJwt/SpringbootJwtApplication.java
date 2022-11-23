package com.jctech.springbootJwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.jctech.springbootJwt.models.ERole;
import com.jctech.springbootJwt.models.Role;
import com.jctech.springbootJwt.repository.RoleRepository;

/**
 * 
 * bootstrap from: 
 * https://www.bezkoder.com/spring-boot-jwt-authentication/#google_vignette
 */

@PropertySource("classpath:application-${spring.profiles.active}.properties")
@SpringBootApplication
public class SpringbootJwtApplication implements CommandLineRunner {

	@Autowired
	private RoleRepository roleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJwtApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
		try {
			roleRepository.save(new Role(ERole.ROLE_ADMIN));
			roleRepository.save(new Role(ERole.ROLE_MODERATOR));
			roleRepository.save(new Role(ERole.ROLE_USER)); 
		} catch (Exception e) {
			System.out.println("Error in saving initial user roles in database...");
		}
	}

}
