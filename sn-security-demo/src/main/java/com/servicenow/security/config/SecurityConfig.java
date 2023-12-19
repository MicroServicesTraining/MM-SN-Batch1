/**
 * 
 */
package com.servicenow.security.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * 
 */
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    @Autowired 
    private DataSource dataSource;	 
    
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Bean
	public UserDetailsManager configAuthentications() {
		JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);		
		users.setUsersByUsernameQuery("select user_name, user_pwd, user_enabled from users where user_name = ?");
		users.setAuthoritiesByUsernameQuery("select user_name, user_role from users where user_name = ?");
		return users;
	}
	
	@Bean
	public SecurityFilterChain configureAuthorizations(HttpSecurity http) throws Exception {
		
		http
		.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/welcome").permitAll())
		.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/admin/**").hasRole("ADMIN"))
		.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/student/show", "/student/menu").hasAnyRole("STUDENT", "ADMIN"))
		.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/teacher/**").hasAnyRole("TEACHER", "ADMIN"))
		.httpBasic(Customizer.withDefaults());
		//.formLogin(Customizer.withDefaults());
		return http.build();	
	}
	
	
}
