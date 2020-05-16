package com.cmayorga.learn.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cmayorga.learn.spring.aop.business.Business1;
import com.cmayorga.learn.spring.aop.business.Business2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	Logger logger = LoggerFactory.getLogger(SpringAopApplication.class);
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;
	
	@Override
	public void run(String... args) throws Exception {
		
		logger.info(business1.SomeBusinessLogic());
		logger.info(business2.SomeBusinessLogic());
		
	}

}
