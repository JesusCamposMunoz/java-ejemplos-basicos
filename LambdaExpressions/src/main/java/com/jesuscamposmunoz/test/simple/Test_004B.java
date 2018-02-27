package com.jesuscamposmunoz.test.simple;
/**
 * 2018-02-26
 * @author Jesus Campos
 * Ejemplo de lambda expressions que retorna un valor.
 *
 */
public class Test_004B {
	   
	interface CompareTwoNumbers {
		void firstIsGreater(int number1, int number2);
	}
	
	public static void main(String[] args) {
		
		CompareTwoNumbers comparison = (a1, a2)->{
			System.out.println("a1 > a2 "+ (a1 > a2));
		};
		
		comparison.firstIsGreater(3,2);
		
		comparison.firstIsGreater(2,3);
		
	}
	
}
