package com.victxl.cadastropjpf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String cadastrarPF(PessoaFisica pessoaFisica) {
		
		pf.save(pessoaFisica);
		
		return "redirect:/";
	
	}
	@RequestMapping("/listapf")
	public ModelAndView listapf() {
		
		ModelAndView mv = new ModelAndView("/listapf");
		
		Iterable<PessoaFisica> pessoaFisica = pf.findAll();
		mv.addObject("pessoaFisica", pessoaFisica);
		
		return mv;
		
	}
	
	@RequestMapping("/listapj")
	public ModelAndView listapj() {
		
		ModelAndView mv = new ModelAndView("/listapj");
		
		Iterable<PessoaJuridica> pessoaJuridica = pj.findAll();
		mv.addObject("pessoaJuridica", pessoaJuridica);
		
		return mv;
		
	}
	
	@RequestMapping(value="/alterarPf/{codigoPF}", method=RequestMethod.GET)
	public ModelAndView formAlterarPF(@PathVariable("codigoPF") long codigoPF) {
		
		PessoaFisica pessoaFisica = pf.findByCodigoPF(codigoPF);
		
		ModelAndView mv = new ModelAndView("alterarPF");
		
		mv.addObject("pessoaFisica", pessoaFisica);
		
		return mv;
		
		
	}
	
	@RequestMapping(value="/alterarPf/{codigoPF}", method=RequestMethod.POST)
	public String alterarPF(@Validated PessoaFisica pessoaFisica, BindingResult result, RedirectAttributes attributes) {
		
		pf.save(pessoaFisica);
		
		return "redirect:/listapf";
		
	}
	
	@RequestMapping(value="/alterarPj/{codigoPJ}", method=RequestMethod.GET)
	public ModelAndView formAlterarPJ(@PathVariable("codigoPJ") long codigoPJ) {
		
		PessoaJuridica pessoaJuridica = pj.findByCodigoPJ(codigoPJ);
		
		ModelAndView mv = new ModelAndView("alterarPJ");
		
		mv.addObject("pessoaJuridica", pessoaJuridica);
		
		return mv;
		
	}
	
	
		
	@RequestMapping(value="/alterarPj/{codigoPJ}", method=RequestMethod.POST)
	public String alterarPJ(@Validated PessoaJuridica pessoaJuridica, BindingResult result, RedirectAttributes attributes) {
		
		pj.save(pessoaJuridica);
		
		return "redirect:/listapj";
		
	}
	
	@RequestMapping("/excluirPf")
	public String excluirPf(long codigoPF) {
		
		PessoaFisica pessoaFisica = pf.findByCodigoPF(codigoPF);
		pf.delete(pessoaFisica);
		
		return "redirect:/";
		
	}


}
	