package com.victxl.tarefas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.victxl.tarefas.models.Tarefa;
import com.victxl.tarefas.repository.TarefaRepository;

@Controller
public class TarefaController {
	
	@Autowired
	private TarefaRepository fr;
	
	@RequestMapping("/")
	public String Index() {
		return "index";
	}
	
	@RequestMapping(value="/formulario", method=RequestMethod.GET)
	public String novaTarefa() {
		return "formulario";
	}
	
	@RequestMapping(value="/formulario", method=RequestMethod.POST)
	public String novaTarefa(Tarefa tarefa) {
		
		fr.save(tarefa);
		
		return "redirect:/formulario";
		
	}
	
	
	
	
	
    @RequestMapping("/listarTarefa")
	public ModelAndView listarTarefa() {
		
		ModelAndView mv = new ModelAndView("listarTarefa");
		
		Iterable<Tarefa> tarefa = fr.findAll();
		mv.addObject("tarefa", tarefa);
		
		return mv;
		
	}
	

}
