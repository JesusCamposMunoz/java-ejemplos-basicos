package com.jesuscamposmunoz.ficheros;

import java.io.File;

public class CreateFile {
	public static void main(String[] args) {
		File f = new File("ficheroCreadoDesdeJavaProg.txt");
		
		boolean boolRes = false;
		
		try {
			//Con la siguiente instrucci�n se crear� el fichero
			boolRes = f.createNewFile();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
