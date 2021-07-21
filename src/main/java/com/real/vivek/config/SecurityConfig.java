//package com.real.vivek.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private final PasswordEncoder passwordEncoder;
//
//	public SecurityConfig(PasswordEncoder passwordEncoder) {
//		super();
//		this.passwordEncoder = passwordEncoder;
//	}
//
//	@Override
//	public void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/", "index", "/css/*", "/js/*").permitAll()
//		.antMatchers("/claim/**").hasAnyRole(ApplicationUserRoles.ADMIN.name()).anyRequest().authenticated()
//		.and().httpBasic();
//	}
//
//	@Override
//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails userAdmin = User.builder().username("admin").password(passwordEncoder.encode("password"))
//				.roles(ApplicationUserRoles.ADMIN.name()).build();
//		UserDetails user = User.builder().username("user").password(passwordEncoder.encode("password"))
//				.roles(ApplicationUserRoles.USER.name()).build();
//		return new InMemoryUserDetailsManager(userAdmin, user);
//	}
//}
