package com.spring.filmes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.filmes.models.Filme;
import com.spring.filmes.repository.FilmesRepository;

@Controller
public class FilmesController {
	
	@Autowired
	private FilmesRepository fr;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/cadastrar-filme", method=RequestMethod.GET)
	public String cadastrarFilme() {
		return "cadastrar-filme";
	}
	
	@RequestMapping(value="/cadastrar-filme", method=RequestMethod.POST)
	public String cadastrarFilme(Filme filme) {
		
		fr.save(filme);
		
		return "redirect:/";
		
	}
	
	@RequestMapping("/lista")
	public ModelAndView lista() {
		
		ModelAndView mv = new ModelAndView("lista");
		
		Iterable<Filme> filmes = fr.findAll();
		mv.addObject("filmes", filmes);
		
		return mv;
		
	}
	
}
