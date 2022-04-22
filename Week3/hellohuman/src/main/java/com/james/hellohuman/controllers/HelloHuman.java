package com.james.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloHuman {
	@RequestMapping("/")
	 public String index(@RequestParam(value="first_name", required=false)String firstname, @RequestParam(value="last_name", required=false)String lastname) {
		if(firstname == null) {
			return "Hello Human";
		}
		else if(lastname == null){
			return "Hello " + firstname;
		}
	return "Hello "+ firstname + " " + lastname;
	}

}

