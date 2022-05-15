package com.james.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.james.dojosandninjas.models.Dojo;
import com.james.dojosandninjas.models.Ninja;
import com.james.dojosandninjas.services.DojoService;
import com.james.dojosandninjas.services.NinjaService;


@Controller
public class NinjaController {
	@Autowired
	private NinjaService ninjas;
	
	@Autowired
	private DojoService dojos;
	
	@GetMapping("/ninjas/new")
	public String addNinja(
		@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojos.listDojos());	
		return "ninjas.jsp";
	}
	
	@PostMapping("/ninjas")
	public String addNinja(@ModelAttribute("ninja") Ninja ninja) {
		ninja = ninjas.addNinja(ninja);
		return "redirect:/dojo/" + ninja.getDojo().getId();
	}

}
