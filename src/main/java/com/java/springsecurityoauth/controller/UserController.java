package com.java.springsecurityoauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/public")
	public String publico() {
		return "Public Page";
	}

	@RequestMapping("/private")
	public String privateEndPoint() {
		return "Private Page";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "Administrator Page";
	}
}
