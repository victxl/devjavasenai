package com.victxl.cadastropjpf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.victxl.cadastropjpf.models.PessoaJuridica;
import com.victxl.cadastropjpf.repository.PessoaFisicaRepository;
import com.victxl.cadastropjpf.repository.PessoaJuridicaRepository;

public class CadastropjpfController {
	
	@Autowired
	private PessoaFisicaRepository pf;
	
	@Autowired
	private PessoaJuridicaRepository pj;
	
	@RequestMapping ("/")
	public String index() {
	return "index";
	}
			
	@RequestMapping(value="/cadastro-pj", method=RequestMethod.GET)
	public String cadastroPJ() {
		return "cadastro-pj";
	}
	
	@RequestMapping(value="/cadastro-pj", method=RequestMethod.POST)
	public String cadastrarPJ(PessoaJuridica pessoajuridica) {
		
		pj.save(pessoajuridica);
		
		return "redirect:/";
		
	}
	
	
	

}