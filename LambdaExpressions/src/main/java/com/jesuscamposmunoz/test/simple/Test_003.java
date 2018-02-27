package com.jesuscamposmunoz.test.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 2018-02-22
 * @author Jesus Campos
 * Ejemplo de foreach con closures (lambda expressions)
 *
 */
public class Test_003 {
	   
	public static void main(String[] args) {
		
        List<String> list=new ArrayList<String>();  
        list.add("uno");  
        list.add("dos");  
        list.add("tres");  
        list.add("cuatro");  
        	
          
        list.forEach(  
            (n)->System.out.println(n)  
        ); 

        list.forEach( 
        	(n)->System.out.println(n)  
        ); 
	}
	
}
