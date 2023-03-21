package com.spring.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@RequestMapping("/myAccount")
	public String helloController(){
		return "This is hello controller";
		
	}
	
}
