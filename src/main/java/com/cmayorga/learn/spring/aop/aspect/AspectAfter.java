package com.cmayorga.learn.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectAfter {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(
			value="execution(* com.cmayorga.learn.spring.aop.business.*.*(..))",
			returning="result"
			)
	public void after(JoinPoint joinPoint, Object result) {

		logger.info("{} returned with value --> {}", joinPoint, result);
	}

}
