package com.jesuscamposmunoz.ficheros;

import java.io.File;
import java.io.FileWriter;

public class WriteInFile {
	public static void main(String[] args) {
		File f = new File("ficheroCreadoDesdeJavaProg.txt");
		
		try {
			//Escibir en el fichero
			FileWriter fw = new FileWriter(f);
			fw.write("Ejemplo de pruebas");
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR");
		}
	}
}
