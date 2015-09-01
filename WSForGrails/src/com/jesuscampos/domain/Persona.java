package com.jesuscampos.domain;

public class Persona {

	private String nombre;
	private String apellidoUno;
	private String apellidoDos;
	private Dni dni;
	
	public Persona() {
	}

	
	public Persona(String nombre, String apellidoUno, String apellidoDos,
			Dni dni) {
		super();
		this.nombre = nombre;
		this.apellidoUno = apellidoUno;
		this.apellidoDos = apellidoDos;
		this.dni = dni;
	}
	
	public Persona(String nombre, String apellidoUno, String apellidoDos) {
		super();
		this.nombre = nombre;
		this.apellidoUno = apellidoUno;
		this.apellidoDos = apellidoDos;
		this.dni = new Dni(1000001 , "DEF");
	}
	

	public Dni getDni() {
		return dni;
	}

	public void setDni(Dni dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoUno() {
		return apellidoUno;
	}
	public void setApellidoUno(String apellidoUno) {
		this.apellidoUno = apellidoUno;
	}
	public String getApellidoDos() {
		return apellidoDos;
	}
	public void setApellidoDos(String apellidoDos) {
		this.apellidoDos = apellidoDos;
	}
	
	
}
