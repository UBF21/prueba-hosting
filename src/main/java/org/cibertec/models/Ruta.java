package org.cibertec.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ruta")
public class Ruta {
	@Id
	@Column(name = "id_Ruta")
	private int idRuta;
	private String nombre;
	private int paraderos;
	
	public Ruta() {
		super();
	}

	public Ruta(int idRuta, String nombre, int paraderos) {
		super();
		this.idRuta = idRuta;
		this.nombre = nombre;
		this.paraderos = paraderos;
	}

	public int getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(int idRuta) {
		this.idRuta = idRuta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getParaderos() {
		return paraderos;
	}

	public void setParaderos(int paraderos) {
		this.paraderos = paraderos;
	}
	
	
	
	
	
}
