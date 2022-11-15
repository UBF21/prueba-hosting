package org.cibertec.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bus")
public class Bus {

	@Id
	@Column(name = "id_Bus")
	private int idBus;
	private String modelo;
	private int asientos;
	
	@Column(name = "caballos_Fuerza")
	private int caballosFuerza;
	private String motor;
	private double ancho;
	private double largo;
	
	@Column(name = "id_Ruta")
	private int idRuta;
	
	@OneToOne
	@JoinColumn(name = "id_Ruta",insertable = false,updatable = false)
	private Ruta ruta;
	
	@Column(name = "id_Chofer")
	private int idChofer;
	
	@OneToOne
	@JoinColumn(name = "id_Chofer",insertable = false,updatable = false)
	private Chofer chofer;

	public Bus() {
		super();
	}

	public Bus(int idBus, String modelo, int asientos, int caballosFuerza, String motor, double ancho, double largo,
			int idRuta, int idChofer) {
		super();
		this.idBus = idBus;
		this.modelo = modelo;
		this.asientos = asientos;
		this.caballosFuerza = caballosFuerza;
		this.motor = motor;
		this.ancho = ancho;
		this.largo = largo;
		this.idRuta = idRuta;
		this.idChofer = idChofer;
	}

	public int getIdBus() {
		return idBus;
	}

	public void setIdBus(int idBus) {
		this.idBus = idBus;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public int getCaballosFuerza() {
		return caballosFuerza;
	}

	public void setCaballosFuerza(int caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public int getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(int idRuta) {
		this.idRuta = idRuta;
	}

	public int getIdChofer() {
		return idChofer;
	}

	public void setIdChofer(int idChofer) {
		this.idChofer = idChofer;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public Chofer getChofer() {
		return chofer;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}
	
	
	
	
}
