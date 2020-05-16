package com.cmayorga.learn.spring.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	
	public String retrieveSomething() {
		return "Dao 1";
	}

}