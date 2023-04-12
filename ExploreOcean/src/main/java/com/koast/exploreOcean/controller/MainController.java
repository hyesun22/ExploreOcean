package com.koast.exploreOcean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
		
	@RequestMapping("/") 
	public String mainView(Model model) {
<<<<<<< .merge_file_U1aows
		System.out.println("-----------------스프링부트 시작11------------");
=======
		System.out.println("-----------------스프링부트 시작------------");
>>>>>>> .merge_file_6U7ZEX
		model.addAttribute("data","123");
			return "test";
	}
	
	
}	
