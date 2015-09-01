package com.jesuscampos.domain;

public class Dni {

	private int numero;
	private String letra;
	
	
	
	public Dni() {
		super();
	}

	public Dni(int numero, String letra) {
		super();
		this.numero = numero;
		this.letra = letra;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	
}
