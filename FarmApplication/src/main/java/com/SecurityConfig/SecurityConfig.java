 /* package com.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails admin = User.withDefaultPasswordEncoder()
				.username("admin")
				.password("admin123")
				.roles("ADMIN")
				.build();
		
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("user")
				.password("user123")
				.roles("USER")
				.build();
		
		return new InMemoryUserDetailsManager(admin,user) ;
	}
}
*/