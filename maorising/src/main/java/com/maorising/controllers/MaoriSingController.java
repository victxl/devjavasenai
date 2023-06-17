package com.maorising.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component

public class MaoriSingController {
	@RequestMapping("/quemsomos")
	public String index() {
		return "index";
	}
	@RequestMapping("/quemsomos")
	public String quemsomos() {
		return "quemsomos";
	}
	@RequestMapping("/formulario")
	public String formulario() {
		return "formulario";
	}

}
