package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ConsumerController {
	
	@GetMapping("/consumer")
	public String ConsumerMessage()
	{
		return null;
		//Changes from Repository to Local
		
	}

}
