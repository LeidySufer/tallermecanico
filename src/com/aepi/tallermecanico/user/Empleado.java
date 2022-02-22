package com.aepi.tallermecanico.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empleado extends Usuario {

	private List <Reparacion> reparacionesRealizadas;
	private String horario;
	private double sueldo;
	private String numeroSeguridadSocial;
	private String iban;
	

	public Empleado(String nombre, String apellidos, Date fechaDeNacimiento, String correo, String usuario,
			String password, String horario, double sueldo, String numeroSeguridadSocial, String iban) {
		super(nombre, apellidos, fechaDeNacimiento, correo, usuario, password);
		this.horario = horario;
		this.sueldo = sueldo;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.iban = iban;
		this.reparacionesRealizadas = new ArrayList();
	}

	public Empleado(String nombre, String apellidos, Date fechaDeNacimiento, String correo, String usuario,
			String password, List<Reparacion> reparacionesRealizadas, String horario, double sueldo,
			String numeroSeguridadSocial, String iban) {
		super(nombre, apellidos, fechaDeNacimiento, correo, usuario, password);
		this.reparacionesRealizadas = reparacionesRealizadas;
		this.horario = horario;
		this.sueldo = sueldo;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.iban = iban;
		
	}

	public List<Reparacion> getReparacionesRealizadas() {
		return reparacionesRealizadas;
	}

	public void setReparacionesRealizadas(List<Reparacion> reparacionesRealizadas) {
		this.reparacionesRealizadas = reparacionesRealizadas;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	public Reparacion asignarReparacion(Reparacion reparacion) {
		
		reparacion.setEmpleado(this);
		return reparacion;
	}
	
	public Reparacion finalizarReparacion(Reparacion reparacion) {
		
		reparacion.setFechaDeFinalizacion(new Date());
		return reparacion;
	}

	
}
