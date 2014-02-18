package com.examplesdevelop.excel;

import java.io.FileOutputStream;
import java.io.IOException;

import com.examplesdevelop.utilities.ExcelUtilities;

public class App {

	public static void main(String[] args) {
		try{
			boolean isXLSX = false;
			//Ahora nos devuelve el documento en memoria.
			byte[] contents = ExcelUtilities.createTestExcel(isXLSX);
			
			//Obtenemos el documento EXCEL al vuelo, generado en memoria, y lo guardamos en disco.
//			FileOutputStream file = new FileOutputStream("prueba.xls");
//			FileOutputStream file = new FileOutputStream("prueba.xlsx");	
			//Lo guarda en la carpeta del proyecto en la raíz.
			//Para poder verlo hay que irse a encima del proyecto y hacer F5 ó refresh, y saldrá.
			//Si fabricamos con modelo antiguo y guardamos con moderno -> al abrir será un archivo corrupto.
//			file.write(contents);
		
//			FileOutputStream file = new FileOutputStream(String.format("prueba.%s", 
//				isXLSX ? "xlsx" : "xls"));
//			file.write(contents);


			//try con la inicialización (con los recursos a consumir). Entonces al salir del try te ahorras
			//poner el close. Si pasa el código por el catch también lo cerraría.
			//Para ello deben tener cerrado el autoclose.
			
			try(FileOutputStream file = new FileOutputStream(String.format("prueba.%s", 
				isXLSX ? "xlsx" : "xls"));)
			{
				file.write(contents);
			}catch(IOException e){}
				

			System.out.println("Operación finalizada.");
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
