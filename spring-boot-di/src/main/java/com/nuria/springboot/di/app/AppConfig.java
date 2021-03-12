package com.nuria.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nuria.springboot.di.app.models.domain.ItemFactura;
import com.nuria.springboot.di.app.models.domain.Producto;
import com.nuria.springboot.di.app.models.service.IServicio;
import com.nuria.springboot.di.app.models.service.MiServicio;



@Configuration
public class AppConfig {
	
	
	@Bean("MiServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
		}

	@Bean("MiServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicio();
		}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		
		Producto producto1 = new Producto ("Camara Sony", 100);
		Producto producto2 = new Producto ("Bicicleta", 200);
		Producto producto3 = new Producto ("Anillo NBA", 800);
		Producto producto4 = new Producto ("Manta", 20);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 6);
		ItemFactura linea3 = new ItemFactura(producto3, 5);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}
	
	//para decirle cual queremos que coja d los dos lo inyectamos con @Qualifier en el pojo o podemos usar @Primary en esta clase
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina(){
		
		Producto producto1 = new Producto ("Notebook", 500);
		Producto producto2 = new Producto ("Impresora", 660);
		Producto producto3 = new Producto ("Pantalla", 25);
		Producto producto4 = new Producto ("Escritorio", 150);
		
		ItemFactura linea1 = new ItemFactura(producto1, 5);
		ItemFactura linea2 = new ItemFactura(producto2, 7);
		ItemFactura linea3 = new ItemFactura(producto3, 2);
		ItemFactura linea4 = new ItemFactura(producto4, 4);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}
}
