package com.xxcep.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

	
	@GetMapping("/login")
	public String login(Model model, String account, String password) {
		
		
			
			return "home";
		
	}

	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}

}