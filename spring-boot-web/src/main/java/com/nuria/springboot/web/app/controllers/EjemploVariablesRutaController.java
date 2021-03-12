package com.nuria.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {

	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "Esto es otro");
		return "variables/index";
	}
	@GetMapping("string/{texto}")
	public String variables(@PathVariable(name="texto") String saludo, Model model) {
		
		model.addAttribute("titulo", "Recibir parametros con path");
		model.addAttribute("saludo", "este es el saludo "+saludo);
		return "variables/ver";
		
	}
	

	@GetMapping("string/{texto}/{numero}")
	public String variables(@PathVariable(name="texto") String saludo, @PathVariable Integer numero, Model model) {

		model.addAttribute("titulo", "Recibir parametros con path");
		model.addAttribute("saludo", "este es el saludo "+saludo);
		model.addAttribute("numero", "este es el numero "+numero);
		return "variables/ver";
		
	}
	
}
