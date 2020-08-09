package com.lbenvenuto;

public class Persona {

	private String dni;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombre;

	public Persona() {

	}

	public Persona(String dni, String apellidoPaterno, String apellidoMaterno, String nombre) {
		super();
		this.dni = dni;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
				+ ", nombre=" + nombre + "]";
	}
	
	

}
