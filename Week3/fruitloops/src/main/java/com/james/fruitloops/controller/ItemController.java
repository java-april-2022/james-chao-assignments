package com.james.fruitloops.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.james.fruitloops.model.Item;

@Controller
public class ItemController {
	
	@RequestMapping("")
	public String index(Model model) {
		
		        
        ArrayList<Item> fruits = new ArrayList<Item>();
        fruits.add(new Item("Apple", 2.5));
        fruits.add(new Item("Mango", 2.5));
        fruits.add(new Item("Pineapple", 5.0));
        fruits.add(new Item("Peach", 1.75));
        fruits.add(new Item("Orange", 3.0));
        
        
        model.addAttribute("fruits", fruits);
		
		return "index.jsp";
	}
}