package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// con la notacción controller le decimos a spring que es un bean y para que lo carge
@Controller
//la notación requestMapping no sirve para indicarle donde están la vistas que va a devolver el
//metodo helloWord
@RequestMapping("/say")
public class HelloWorldController {
	
	// con esta notacion indicamos que es una peticion get y le indicamos el nombre de la
	// vista a recuperar
	@GetMapping("/holamundo")
	public String helloWorld() {
		return "holamundo";
	}
}
