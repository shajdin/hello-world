package com.shajdin;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.shajdin.service.UserService;
import com.shajdin.service.UserServiceImpl;

@Configuration
@EntityScan(basePackages={"com.shajdin.model"})
@EnableJpaRepositories(basePackages={"com.shajdin.repository"})
@EnableTransactionManagement
@ComponentScan(basePackages={"com.shajdin.service", "com.shajdin.conntroller"})
public class Config {
	
	@Bean
	public UserService userService(){
		return new UserServiceImpl();
	}

}
