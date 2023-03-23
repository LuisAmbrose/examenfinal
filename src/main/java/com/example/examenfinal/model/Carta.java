package com.example.examenfinal.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Carta")
@Data
public class Carta {
///////////////////////////////////////////////
///////////////////////////////////////////////
	private String nombre;
	private String categoria;
	private Integer cantidad;
///////////////////////////////////////////////
///////////////////////////////////////////////
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
///////////////////////////////////////////////
///////////////////////////////////////////////
}
