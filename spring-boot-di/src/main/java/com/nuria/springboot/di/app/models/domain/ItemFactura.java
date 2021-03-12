package com.nuria.springboot.di.app.models.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class ItemFactura {
	
	
	public Producto producto;
	public Integer cantidad;
	
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public ItemFactura(Producto producto, Integer cantidad) {

		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public Integer calcularImporte() {
		return cantidad*producto.getPrecio();
	}
	
	
	
	

}
