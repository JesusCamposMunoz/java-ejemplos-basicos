package com.jesuscamposmunoz.test.simple;
/**
 * 2018-02-22
 * @author Jesus Campos
 *
 */
public class Test_002 {

	interface GreetingService {
		void sayMessage(String message);
	}
	
	interface GreetingService2 {
		void sayMessage(String message1, String message2);
	}
	   
	public static void main(String[] args) {
		
		//without parenthesis
		GreetingService greetService1 = message ->
		System.out.println("Hello " + message);
					
		//with parenthesis
		GreetingService greetService2 = (message) ->
		System.out.println("Hello " + message);
		
		//customized
		GreetingService2 greetService3 = (message1, message2) ->{
			System.out.println(message1 + " " + message2);
		};
					
		greetService1.sayMessage("Jesús");
		greetService2.sayMessage("Campos");
		greetService2.sayMessage("Muñoz");
		greetService3.sayMessage("Hola", "Jesús Campos Muñoz");
	}
	
}
