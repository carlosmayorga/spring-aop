package com.cmayorga.learn.spring.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmayorga.learn.spring.aop.dao.Dao2;

@Service
public class Business2 {
	
	
	@Autowired
	private Dao2 dao2;
	
	
	public String SomeBusinessLogic() {
		return dao2.retrieveSomething();
	}

}
