package com.helloworld.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordController {
	@RequestMapping("/")	
	public String index() {
				return "index";
		
		}
		
	

}
