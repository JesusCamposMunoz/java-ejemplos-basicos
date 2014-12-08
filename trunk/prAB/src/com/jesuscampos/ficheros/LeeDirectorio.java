package com.jesuscampos.ficheros;

import java.io.File;
import java.io.IOException;

import com.jesuscampos.ficheros.utils.FicherosUtils;

public class LeeDirectorio {
	
	public static void main(String[] args) {
		
		String path = "D:/PAS_DOCS";
		
		try{
			File file = new File(path);
			
			//El siguiente vector de String's contiene la lista de directorios y archivos.
			String[] directorios = file.list();
			
			for (String string : directorios) {
				System.out.println(string);
				
	//			//Comprobación de si el elemento dentro del directorio es otro directorio.
	//			//Para comprobar si un String es un directorio necesitamos que la referencia se de tipo File.
	//			if(new File(path+"/"+string).isDirectory())
	//			{
	//				System.out.println("Es un directorio: "+string);
	//			}
				
				System.out.println(FicherosUtils.isDirectory(path, string));
			}
		}
		catch(NullPointerException e){
			System.out.println("FICHERO ERRONE");
		}
	}

}
