package com.cmayorga.learn.spring.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmayorga.learn.spring.aop.dao.Dao1;

@Service
public class Business1 {
	
	@Autowired
	private Dao1 dao1;
	
	
	public String SomeBusinessLogic() {
		return dao1.retrieveSomething();
	}

}
