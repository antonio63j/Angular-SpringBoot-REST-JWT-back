package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.*;

import com.app.config.GenerateTokenForUserFilter;

import lombok.extern.slf4j.Slf4j;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableJpaRepositories(basePackages ={ "com.app.repo"})
@EntityScan(basePackages ={ "com.app.model"})
@EnableTransactionManagement

@Slf4j

public class MainApp {
	public static void main(String[] args) throws Exception {
		log.debug(" MainApp en debug");
		new SpringApplication(MainApp.class).run(args);
	}
}



/*
SpringBoot Notes

@Bean      :tells Spring 'here is an instance of this class, please keep hold of it and give it back to me when I ask'.
@Autowired :says 'please give me an instance of this class, for example, one that I created with an @Bean annotation earlier'.

*/
