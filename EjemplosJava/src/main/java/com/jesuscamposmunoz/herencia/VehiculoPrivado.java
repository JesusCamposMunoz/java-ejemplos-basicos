package com.jesuscamposmunoz.herencia;

public abstract class VehiculoPrivado {

	private void acelerar(int aceleracion){
		
	}
	
	public void decelerar(int deceleracion, int tiempoFrenada){
		acelerar(-900);
	}
	
	public abstract void frenar(int deceleracion, int tiempoFrenada);
	
	public abstract void frenar(int deceleracion);
	
	
}
