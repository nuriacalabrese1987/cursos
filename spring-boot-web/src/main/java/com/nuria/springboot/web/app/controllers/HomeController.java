package com.nuria.springboot.web.app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	// redirige a otra pagina
	@GetMapping("/")
	public String home() {
	
		return "redirect:https://www.google.com";
	}
	
	// redirige a una pagina externa
	@GetMapping("/otro")
	public String home2() {
	
		return "redirect:/app/index";
	}
	
	
	//sin reiniciar tambien cambia y guardaria los parametros que pasemos, en los otrs no, ademas mantiene la ruta del navegador. Esta es la mejor opcion, es solo para rutas propias del proyecto
	@GetMapping("/otromas")
	public String home3() {
	
		return "forward:/app/index";
	}
}