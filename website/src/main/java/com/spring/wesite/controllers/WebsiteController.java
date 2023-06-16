package com.spring.wesite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WebsiteController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/contato")
    public String contato() {
        return "contato";
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
