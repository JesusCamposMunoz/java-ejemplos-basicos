package com.jesuscamposmunoz.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
	public static void main(String[] args) {
		
		String cadena;
		
		try {
			FileReader f = new FileReader("ficheroNum1.txt");
	        BufferedReader b = new BufferedReader(f);
	        while((cadena = b.readLine())!=null) {
	            System.out.println(cadena);
	        }
	        b.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR");
		}
	}
}
