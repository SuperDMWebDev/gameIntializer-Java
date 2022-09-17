package com.springboot.gameintializer.sample.enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.gameintializer.sample.enterprise.flow.business.BusinessService;

//Sending response in right format 
@RestController
public class Controller {
	
	@Autowired
	private BusinessService businessSerivce;
	@GetMapping("/sum")
	public long displaySum()
	{
		return businessSerivce.calculateSum();
	}
}

