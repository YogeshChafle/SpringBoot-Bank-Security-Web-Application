package com.spring.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
	
	@RequestMapping("/myLoans")
	public String getLoanDetails(){
		return "This is hello controller";
		
	}
	
}
