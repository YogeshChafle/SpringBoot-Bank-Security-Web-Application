package com.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests()
			.requestMatchers("/myAccount", "myBalance", "/myLoans", "myCards").authenticated()
			.requestMatchers("/notices", "/contact").permitAll()
		 	.and().formLogin()
		 	.and().httpBasic();
		return http.build();
		//This is for permitting or allowing all the http request coming form the user
//		http.authorizeHttpRequests().anyRequest().permitAll()
//		 .and().formLogin()
//	 	.and().httpBasic();
//	return http.build();
		
		//This is for denying all the http request coming form the user
//		http.authorizeHttpRequestsf().anyRequest().denyAll()
//		 .and().formLogin()
//	 	.and().httpBasic();
//	return http.build();
		
		
		
		
	}
	//Approach 1 to create user inside the memory
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		UserDetails admin = User.withDefaultPasswordEncoder()
				.username("admin")
				.password("12345")
				.authorities("admin")
				.build();
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("user")
				.password("12345")
				.authorities("read")
				.build();
		return new InMemoryUserDetailsManager(admin, user);
		
	}



}
