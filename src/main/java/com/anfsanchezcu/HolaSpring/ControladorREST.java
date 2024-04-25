package com.anfsanchezcu.HolaSpring;

import  lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
@Slf4j
public class ControladorREST {
  
  @Value("${index.aux_hola}")
  private String aux_hola;


  @GetMapping("/")
  public String saludo(Model model) {
    log.info("Estoy ejecutando el controlador MVC");

    String hola = "Hola Spring Boot con Thymeleaf";
    model.addAttribute("hola",hola);
    model.addAttribute("aux_hola",aux_hola);
    
    return "index";
  }
}
