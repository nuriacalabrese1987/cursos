package com.nuria.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nuria.springboot.di.app.models.service.IServicio;


@Controller
public class IndexController {
	
	
	//asi inyectamos un servicio registrado en una interfaz
	@Autowired
	@Qualifier("MiServicioSimple")
	private IServicio servicio;
	


	@GetMapping({"/index","/",""})
	public String index(Model model) {
		
		model.addAttribute("objeto", servicio.operacion());
		
		return "index";
	}




}
