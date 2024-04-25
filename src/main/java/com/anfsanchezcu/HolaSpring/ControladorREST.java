package com.anfsanchezcu.HolaSpring;

import  lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class ControladorREST {
  
  @GetMapping("/")
  public String saludo() {
    log.info("Estoy ejecutando el controlador rest");
    log.info("MAS INFO");

    return "Hola Spring Boot";
  }
}
