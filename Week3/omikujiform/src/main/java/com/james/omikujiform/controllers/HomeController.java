package com.james.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.james.fruitloops.model.Item;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji")
	public String omikuji() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji/show")
	public String result(HttpSession session, Model model) {
		return "show.jsp";
	}
	
	@PostMapping("/info")
	public String info(
			@RequestParam("number") int number,
			@RequestParam("location") String location,
			@RequestParam("person") String person,
			@RequestParam("hobby") String hobby,
			@RequestParam("livingthing") String livingthing,
			@RequestParam("kindmessage") String kindmessage,
			HttpSession session
			) {
		session.setAttribute("number", number);
		session.setAttribute("location", location);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingthing", livingthing);
		session.setAttribute("kindmessage", kindmessage);
		
		return "redirect:/omikuji/show";
			}

}

