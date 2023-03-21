package com.spring.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@RequestMapping("/contact")
	public String saveContactInquiryDetails(){
		return "This is hello controller";
		
	}
	
}
