package com.victxl.cadastropjpf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.victxl.cadastropjpf.repository.PessoaFisicaRepository;

public class CadasdropjpfController {
	
	@Autowired
	private PessoaFisicaRepository pf;
	
	@RequestMapping ("/")
		public String index() {
		return "index";
	}

}