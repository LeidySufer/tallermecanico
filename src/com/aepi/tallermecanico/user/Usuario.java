package com.aepi.tallermecanico.user;

import java.util.Date;

public class Usuario {
	
	private String nombre;
	private String apellidos;
	private Date fechaDeNacimiento;
	private String correo;
	private String usuario;
	private String password;
	
	
	public Usuario(String nombre, String apellidos, Date fechaDeNacimiento, String correo, String usuario,
			String password) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.correo = correo;
		this.usuario = usuario;
		this.password = password;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	

}
