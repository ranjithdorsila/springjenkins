package com.data.main;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sun.org.slf4j.internal.LoggerFactory;

@SpringBootApplication
public class SpringjenkinsApplication {

	
	public static Logger logger=(Logger) LoggerFactory.getLogger(SpringjenkinsApplication.class);
	
	@PostConstruct
	public void intt()
	{
		logger.info("app started..");
	}
	public static void main(String[] args) {
		
		logger.info("in main");
		SpringApplication.run(SpringjenkinsApplication.class, args);
		
		
	}

}
