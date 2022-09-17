package com.springboot.gameintializer.sample.enterprise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Sending response in right format 
@RestController
public class Controller {
	@GetMapping("/sum")
	public long displaySum()
	{
		return 100;
	}
}

class BusinessService {
	
}

class DataService {
	
}