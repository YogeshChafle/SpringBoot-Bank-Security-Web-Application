package com.spring.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
	
	@RequestMapping("/notices")
	public String getNotices(){
		return "This is hello controller";
		
	}
	
}
