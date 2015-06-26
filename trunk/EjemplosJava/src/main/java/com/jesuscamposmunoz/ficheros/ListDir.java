package com.jesuscamposmunoz.ficheros;
/**
 * Lista los diretorios/ficheros de un directorio.
 */
import java.io.File;

public class ListDir {
	public static void main(String[] args) {
		File f = new File("dirPruebas");
		
		try {
			//El siguiente vector de String's contiene la lista de directorios y archivos.
			String[] directorios = f.list();
			for (String string : directorios) {
				System.out.print(string);
				if(new File("dirPruebas"+"/"+string).isDirectory()){
					System.out.println(" - Es un directorio");
				}
				else{
					System.out.println();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR");
		}
	}
}
