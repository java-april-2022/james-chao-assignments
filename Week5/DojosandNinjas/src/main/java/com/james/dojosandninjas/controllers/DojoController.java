package com.james.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.james.dojosandninjas.models.Dojo;
import com.james.dojosandninjas.services.DojoService;

@Controller
public class DojoController {
	@Autowired
	private DojoService DojoService;
	
	
	@GetMapping("/")
	public String Dojo(@ModelAttribute("dojo")Dojo dojo) {
		return "dojo.jsp";
	}
	
	@PostMapping("/newDojo")
	public String createDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "dojo.jsp";
		}
		this.DojoService.saveDojo(dojo);
		return "redirect:/";
	}
	
	
	@GetMapping("/dojo/{id}")
	public String dojoDetails(Model viewModel, @PathVariable("id")Long id) {
		viewModel.addAttribute("dojo", this.DojoService.dojoDetails(id));
		return "details.jsp";
	}
}
