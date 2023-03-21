package com.spring.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
	
	@RequestMapping("/myCards")
	public String getCardDetails(){
		return "This is hello controller";
		
	}
	
}
