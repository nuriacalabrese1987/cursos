package com.nuria.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("MiServicioComplejo")

public class MiServicioComplejo implements IServicio{

	@Override
	public String operacion() {
		
		return "ejecutando algun proceso importante complejo...";
	}

}
