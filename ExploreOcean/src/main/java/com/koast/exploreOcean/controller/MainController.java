package com.koast.exploreOcean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
		
	@RequestMapping("/") 
	public String mainView(Model model) {
		System.out.println("-----------------스프링부트 시작------------");
		model.addAttribute("data","123");
			return "test";
	}
	
	
}	
