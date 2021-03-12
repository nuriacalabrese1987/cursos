package com.nuria.springboot.di.app.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


@Component
@RequestScope
public class Factura implements Serializable{

	//@SessionScope necesita implementar Serializable
	//@RequestScope si haces esto el objeto se va construyendo sobre el anterior, no se genera de nuevo cada vez
	//@ApplicationScope 
	/**
	 * 
	 */
	private static final long serialVersionUID = -8313831688414969981L;

	@Value("${factura.descripcion}")
	public String descripcion;

	@Autowired
	public Cliente cliente;
	
	@Autowired
	@Qualifier("itemsFacturaOficina")
	public List<ItemFactura> items;
	
	@PostConstruct
	public void inicializar() {
		cliente.setNombre(cliente.getNombre()+" Jose");
		descripcion=descripcion.concat(cliente.getNombre());
		
	}
	@PreDestroy
	public void destruir() {
		
		System.out.println("Factura destruida: "+descripcion);
		
	}
	
	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
