package com.jesuscamposmunoz.interfaces;

public interface Vehiculo {

	public abstract void acelerar(int aceleracion);
	
	public abstract void frenar(int deceleracion, int tiempoFrenada);
	
	public abstract void frenar(int deceleracion);
}
