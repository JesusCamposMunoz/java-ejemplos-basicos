package com.jesuscamposmunoz.ficheros;

import java.io.File;
import java.io.FileReader;

public class OpenFile {
	public static void main(String[] args) {
		File f = new File("ficheroNum1.txt");
		
		try {
			//Escibir en el fichero
			FileReader fr = new FileReader(f);
			char[] in = new char[50];
			fr.read(in);
			System.out.println(in);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR");
		}
	}
}
