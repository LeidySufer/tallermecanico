package com.aepi.tallermecanico.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Usuario{
	
	private List <Reparacion> solicitudReparacion;
	private boolean clientePremium;
	private boolean clienteMoroso;
	private List<TarjetaDeCredito> tarjetaDeCredito;
	
	
	
	public Cliente(String nombre, String apellidos, Date fechaDeNacimiento, String correo, String usuario,
			String password, List<Reparacion> solicitudReparacion) {
		super(nombre, apellidos, fechaDeNacimiento, correo, usuario, password);
		this.solicitudReparacion = solicitudReparacion;
	}
	
	public Cliente(String nombre, String apellidos, Date fechaDeNacimiento, String correo, String usuario,
			String password) {
		super(nombre, apellidos, fechaDeNacimiento, correo, usuario, password);
		this.solicitudReparacion = new ArrayList();
	}

	public List<Reparacion> getSolicitudReparacion() {
		return solicitudReparacion;
	}

	public void setSolicitudReparacion(List<Reparacion> solicitudReparacion) {
		this.solicitudReparacion = solicitudReparacion;
	}

	public boolean isClientePremium() {
		return clientePremium;
	}

	public void setClientePremium(boolean clientePremium) {
		this.clientePremium = clientePremium;
	}

	public boolean isClienteMoroso() {
		return clienteMoroso;
	}

	public void setClienteMoroso(boolean clienteMoroso) {
		this.clienteMoroso = clienteMoroso;
	}

	public List<TarjetaDeCredito> getTarjetaDeCredito() {
		return tarjetaDeCredito;
	}

	public void setTarjetaDeCredito(List<TarjetaDeCredito> tarjetaDeCredito) {
		this.tarjetaDeCredito = tarjetaDeCredito;
	}
	
	public Reparacion solicitarReparacion(Empleado empleado, double precio, Date fechaDeEntrega, Date fechaDeRecepcion) {
		
		Reparacion reparacion = new Reparacion(empleado, this, precio, fechaDeEntrega, fechaDeRecepcion, null, false, false, null, null);
		if (solicitudReparacion==null) {
			solicitudReparacion = new ArrayList();
		}
		solicitudReparacion.add(reparacion);
		return reparacion;
	}
	
	public Reparacion solicitarRecogida(Empleado empleado, double precio, Date fechaDeEntrega, Date fechaDeRecepcion, String direccionRecogida) {
		Reparacion reparacion = new Reparacion(empleado, this, precio, fechaDeEntrega, fechaDeRecepcion, null, false, true, direccionRecogida, null);
		if (solicitudReparacion==null) {
			solicitudReparacion = new ArrayList();
		}
		return reparacion;
	}
	
}
