package com.koast.exploreOcean.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koast.exploreOcean.model.Test;
import com.koast.exploreOcean.service.TestService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	
	private final TestService testService;
	
	@RequestMapping("/") 
	public String mainView(Model model, HttpServletRequest request) throws Exception {
		System.out.println("-----------------스프링부트 시작------------");
			List<Test> list = testService.selectAll();
		    model.addAttribute("data","123");
		    System.out.println(list);
			model.addAttribute("test", list);
			return "index";
	}

}	
