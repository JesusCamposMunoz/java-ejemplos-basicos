package com.jesuscamposmunoz.test.simple;
/**
 * 2018-02-26
 * @author Jesus Campos
 * Ejemplo de lambda expressions que retorna un valor.
 *
 */
public class Test_004 {
	   
	interface CompareTwoNumbers {
		boolean firstIsGreater(int number1, int number2);
	}
	
	public static void main(String[] args) {
		
		CompareTwoNumbers comparison = (a1, a2)->{
			return a1 > a2;
		};
		
		System.out.println(comparison.firstIsGreater(3,2));
		
		System.out.println(comparison.firstIsGreater(2,3));
		
	}
	
}
