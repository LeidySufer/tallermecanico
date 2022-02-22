package com.aepi.tallermecanico.user;

import java.util.Date;


public class Reparacion {
	
	private Empleado empleado;
	private Cliente cliente;
	private double precio;
	private Date fechaDeEntrega;
	private Date fechaDeRecepcion;
	private String valoracionCliente;
	private boolean liquidado;
	private boolean recogidaPendiente;
	private String direccionRecogida;
	private Date fechaDeFinalizacion;
	
	public Reparacion() {
		
	}
	
	public Reparacion(Empleado empleado, Cliente cliente, double precio, Date fechaDeEntrega, Date fechaDeRecepcion,
			String valoracionCliente, boolean liquidado, boolean recogidaPendiente, String direccionRecogida, Date fechaDeFinalizacion) {
		super();
		this.empleado = empleado;
		this.cliente = cliente;
		this.precio = precio;
		this.fechaDeEntrega = fechaDeEntrega;
		this.fechaDeRecepcion = fechaDeRecepcion;
		this.valoracionCliente = valoracionCliente;
		this.liquidado = liquidado;
		this.fechaDeFinalizacion = fechaDeFinalizacion;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFechaDeEntrega() {
		return fechaDeEntrega;
	}

	public void setFechaDeEntrega(Date fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}

	public Date getFechaDeRecepcion() {
		return fechaDeRecepcion;
	}

	public void setFechaDeRecepcion(Date fechaDeRecepcion) {
		this.fechaDeRecepcion = fechaDeRecepcion;
	}

	public String getValoracionCliente() {
		return valoracionCliente;
	}

	public void setValoracionCliente(String valoracionCliente) {
		this.valoracionCliente = valoracionCliente;
	}

	public boolean isLiquidado() {
		return liquidado;
	}

	public void setLiquidado(boolean liquidado) {
		this.liquidado = liquidado;
	}

	public boolean isRecogidaPendiente() {
		return recogidaPendiente;
	}

	public void setRecogidaPendiente(boolean recogidaPendiente) {
		this.recogidaPendiente = recogidaPendiente;
	}

	public String getDireccionRecogida() {
		return direccionRecogida;
	}

	public void setDireccionRecogida(String direccionRecogida) {
		this.direccionRecogida = direccionRecogida;
	}

	public Date getFechaDeFinalizacion() {
		return fechaDeFinalizacion;
	}

	public void setFechaDeFinalizacion(Date fechaDeFinalizacion) {
		this.fechaDeFinalizacion = fechaDeFinalizacion;
	}
	
}
