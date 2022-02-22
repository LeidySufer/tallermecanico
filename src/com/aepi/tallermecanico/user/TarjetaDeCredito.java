package com.aepi.tallermecanico.user;

import java.util.Date;

public class TarjetaDeCredito {
	
	private String nombre;
	private String cvv;
	private String pan;
	private String fechaDeExpiracion;
	
	public TarjetaDeCredito(String nombre, String cvv, String pan, String fechaDeExpiracion) {
		super();
		this.nombre = nombre;
		this.cvv = cvv;
		this.pan = pan;
		this.fechaDeExpiracion = fechaDeExpiracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getFechaDeExpiracion() {
		return fechaDeExpiracion;
	}

	public void setFechaDeExpiracion(String fechaDeExpiracion) {
		this.fechaDeExpiracion = fechaDeExpiracion;
	}

}
