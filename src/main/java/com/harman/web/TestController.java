package com.harman.web;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value="/getmessage")
	public String getMessage() {
		return "Hello your application deployed successfully!";
	}
	
}


