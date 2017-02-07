package com.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.backend.service.MockEmailService;

@Configuration
@Profile("dev")
@PropertySource("file:///C:/Users/Don Collo/Desktop/SSH-KEYS/DEVOPSBUDDY/application-dev.properties")
public class DevelopmentConfig {
	
	@Bean
	public EmailService emailService(){
		return new MockEmailService();
	}
}
