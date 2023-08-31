package com.rami.restdemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;

@Configuration
public class CustomWebSecurityConfigurerAdapter {
	
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	http
		.authorizeHttpRequests((authorize) -> authorize
			.requestMatchers("/*").permitAll());
    	return http.build(); 
}
}

