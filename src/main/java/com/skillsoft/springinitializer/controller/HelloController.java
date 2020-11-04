package com.skillsoft.springinitializer.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(value="/")
	public String index() {
		return "We have successfully used the Spring initializer";
	}
	
	@GetMapping(value="/welcome")
	 public String welcome() {
		return "Welcome to Spring Initializer";
		
	}
	@GetMapping(value="/hello")
	public String hello() {
		return " Hello Spring Initializer";
	
}
}