package com.victxl.cadastropjpf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.victxl.cadastropjpf.models.PessoaFisica;
import com.victxl.cadastropjpf.models.PessoaJuridica;
import com.victxl.cadastropjpf.repository.PessoaFisicaRepository;
import com.victxl.cadastropjpf.repository.PessoaJuridicaRepository;


@Controller
public class CadastropjpfController {
	
	@Autowired
	private PessoaFisicaRepository pf;
	
	@Autowired
	private PessoaJuridicaRepository pj;
	
	@RequestMapping ("/")
	public String index() {
	return "index";
	}
			
	@RequestMapping(value="/cadastroPj", method=RequestMethod.GET)
	public String cadastroPJ() {
		return "cadastroPj";
	}
	
	@RequestMapping(value="/cadastroPj", method=RequestMethod.POST)
	public String cadastrarPJ(PessoaJuridica pessoajuridica) {
		
		pj.save(pessoajuridica);
		
		return "redirect:/";
		
	}
	
	@RequestMapping(value="/cadastroPf", method=RequestMethod.GET)
	public String cadastroPF() {
		return "cadastroPf";
	}
	
	@RequestMapping(value="/cadastroPf", method=RequestMethod.POST)
	public String cadastrarPF(PessoaFisica pessoafisica) {
		
		pf.save(pessoafisica);
		
		return "redirect:/";
	
	}
	@RequestMapping("/lista")
	public ModelAndView lista() {
		
		ModelAndView mv = new ModelAndView("/lista");
		
		Iterable<PessoaFisica> pessoaFisica = pf.findAll();
		mv.addObject("pessoaFisica", pessoaFisica);
		
		return mv;
		
	}

}