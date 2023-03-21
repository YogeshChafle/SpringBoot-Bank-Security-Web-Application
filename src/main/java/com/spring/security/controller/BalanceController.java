package com.spring.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
	
	@RequestMapping("/myBalance")
	public String getBalanceDetails(){
		return "This is hello controller";
		
	}
	
}
