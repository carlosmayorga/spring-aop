package com.cmayorga.learn.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class AspectBefore {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	/* Format to specific something to intercept:
	 * execution(*           package.*.    *(..))
	 *           ∆                   ∆     ∆
	 *           |                   |     |
	 *          Return type        Class  Method
	 */
	@Before("execution(* com.cmayorga.learn.spring.aop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		
		logger.info("Intercepted Method Calls - {}", joinPoint);
	}

}
