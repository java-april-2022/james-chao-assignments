package com.james.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RESTController {
//   http://localhost:8080/
	@RequestMapping("/")
	 public String index() {
		 return "Hello Spring";
	 }
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Boot!";
	}
}
