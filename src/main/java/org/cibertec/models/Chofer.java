package org.cibertec.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chofer")
public class Chofer {

	@Id
	@Column(name = "id_Chofer")
	private int idChofer;
	private String nombre;
	private String apellido;
	private int edad;
	
	public Chofer() {
		super();
	}

	public Chofer(int idChofer, String nombre, String apellido, int edad) {
		super();
		this.idChofer = idChofer;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public int getIdChofer() {
		return idChofer;
	}

	public void setIdChofer(int idChofer) {
		this.idChofer = idChofer;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
