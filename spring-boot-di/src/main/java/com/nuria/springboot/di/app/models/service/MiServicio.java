package com.nuria.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

//@Component("miServicioSimple")  //se puede poner o component o service, service es mas especifico de lo que hace pero da igual cual uses

//@Primary //esta anotacion se pone si quiero que esta clase sea la que va por defecto cuando invoco la interfaz
public class MiServicio implements IServicio {
	
	@Override  //esto indica que hereda de un padre
	public String operacion() {
		
		return "ejecutando algun proceso importante simple...";
	}

}
