package com.rt.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String checkHealth() {
		return "Hi! Welcome to RT Core Application.";
	}

}
