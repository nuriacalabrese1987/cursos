package com.nuria.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nuria.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;
	
	//La interfaz Model permite pasar datos con llave y valor, podemos usar tambien modelMap, pero esto es una clase, no es una interfaz, Map<String, Object> y ModelandView	
	//retornara el nombre de la plantilla html a la que llamamos index, y podemos mapearlo a varias rutas entre llaves
	@GetMapping({"/index", "/","/home" })
	public String index(Model model) {
		
		model.addAttribute("titulo", textoIndex);
		return "index";
	}
	
	/*CON ESTE METODO LE PODEMOS PASAR EL NOMBRE DE LA VISTA POR PARAMETROS 
	 * public ModelAndView index(ModelAndView mv){
	 * mv.addObject("titulo","hola a todos");
	 * mv.setViewName("index");
	 * return mv;
	 * }*/
	
	
	//lo ponemos distinto por variar
	@RequestMapping(value="/perfil", method=RequestMethod.GET)
	public String perfil(Model model) {
		Usuario usuario = new Usuario ("Andres", "Gonzalez","nuriacalabre@");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil+usuario.getNombre());
		
		return "perfil";
	}
	
	//el mismo pero con una lista
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String listar (Model model) {
		


		model.addAttribute("titulo", textoListar);

		
		return "listar";
	}
	
	//creamos un metodo que pasa a todas las vistas la lista de usuario
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new Usuario("Andres", "Gonzalez", "ag@gmail.com"),
				new Usuario("Pepe", "Lopez", "pl@gmail.com"),
				new Usuario("Nuria", "Hernandez", "nh@gmail.com"),
				new Usuario("Maria", "Martinez", "mm@gmail.com"));

		return usuarios;
		
	}
	
}
