package com.jesuscamposmunoz.switchTest;

import com.jesuscamposmunoz.herencia.CochePrivado;
import com.jesuscamposmunoz.herencia.VehiculoPrivado;

public class SwitchTest_001 {

	public static void main(String[] args) {
		
//		Vehiculo vehicle = new Coche();
//		vehicle.fre
		
		VehiculoPrivado vehicle = new CochePrivado();
		vehicle.decelerar(2, 2);
		
		char letra = 'a';
		
		switch (letra) {
		case 'A':
				System.out.println("es la letra A");
			break;

		default:
			break;
		}
	}
}
