package com.git.golfsocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class GolfSocialAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GolfSocialAppApplication.class, args);
		System.out.println("run app");
	}
//
//	  @Bean
//	  public PasswordEncoder configurePasswordEncoder() {
//	    return new BCryptPasswordEncoder();
//	  }
}
