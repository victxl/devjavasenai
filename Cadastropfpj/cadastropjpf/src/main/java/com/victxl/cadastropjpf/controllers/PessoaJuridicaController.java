package com.victxl.cadastropjpf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


import com.victxl.cadastropjpf.repository.PessoaJuridicaRepository;

public class PessoaJuridicaController {
	
	@Autowired
	private PessoaJuridicaRepository pj;
	
	@RequestMapping ("/")
		public String index() {
		return "index";
	}

}
