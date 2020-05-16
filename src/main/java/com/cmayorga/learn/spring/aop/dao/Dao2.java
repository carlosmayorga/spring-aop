package com.cmayorga.learn.spring.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
	
	public String retrieveSomething() {
		return "Dao 2";
	}

}
