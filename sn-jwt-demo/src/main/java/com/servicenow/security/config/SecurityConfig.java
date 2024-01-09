/**
 * 
 */
package com.servicenow.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.servicenow.security.filters.JwtSecurityFilter;
import com.servicenow.services.UserInfoService;

/**
 * 
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private JwtSecurityFilter authFilter; 

	// User Creation 
	@Bean
	public UserDetailsService userDetailsService() { 
		return new UserInfoService(); 
	}
		
		@Bean
		public SecurityFilterChain configureAuthorizations(HttpSecurity http) throws Exception {
			http
			.csrf().disable()
			.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/auth/welcome").permitAll())
			.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/auth/admin").hasRole("ADMIN"))
			.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/auth/customer").hasAnyRole("CUSTOMER", "ADMIN"))
			.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/auth/seller").hasAnyRole("SELLER", "ADMIN"))
			.httpBasic(Customizer.withDefaults());
			//.formLogin(Customizer.withDefaults());
			return http.build();	
		}
		// Password Encoding 
		@Bean
		public PasswordEncoder passwordEncoder() { 
			return new BCryptPasswordEncoder(); 
		} 

		@Bean
		public AuthenticationProvider authenticationProvider() { 
			DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider(); 
			authenticationProvider.setUserDetailsService(userDetailsService()); 
			authenticationProvider.setPasswordEncoder(passwordEncoder()); 
			return authenticationProvider; 
		} 

		@Bean
		public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception { 
			return config.getAuthenticationManager(); 
		} 
}
