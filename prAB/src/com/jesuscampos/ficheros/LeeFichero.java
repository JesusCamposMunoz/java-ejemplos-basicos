package com.jesuscampos.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.jesuscampos.ficheros.utils.FicherosUtils;

public class LeeFichero {

	public static void main(String[] args) {
		
		String path = "D:/prAA.txt";
		
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	      
		try{
			File file = new File(path);
			fr = new FileReader (file);
			br = new BufferedReader(fr);
			 
			         // Lectura del fichero
			String linea;
			while((linea=br.readLine())!=null){
				System.out.println(linea);
				if(linea.contains("\u000C"))	//Detecta Form Feed (FF)
				{
					System.out.println("Contenido está!!!!!!!!!!!");
				}
			}
				
 
			System.out.println("Fichero abierto");
		}
		catch(NullPointerException e){
			System.out.println("FICHERO ERRONEO");
		}
		catch(Exception e){
			System.out.println("ERROR EN LECTURA DE FICHERO");
			e.printStackTrace();
		}
	}
}
