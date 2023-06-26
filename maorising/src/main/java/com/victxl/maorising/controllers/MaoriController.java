package com.victxl.maorising.controllers;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MaoriController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        // Adicione os atributos do modelo, se necessário
        return "index";
    }

    // Adicione outros métodos e mapeamentos conforme necessário

}
