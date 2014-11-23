package com.jesuscampos.ficheros.utils;

import java.io.File;

public class FicherosUtils {

	/*
	 * @autor: Jesús Campos Muñoz (jesus.campos.munoz@gmail.com)
	 * @version: 1.0
	 * @since: 2014-11-07
	 * 
	 * @param  path Ruta donde se encuentra el arcivo.
	 * @param  file Nombre del archivo.
	 * 
	 * @return boolean Devuelve TRUE si el archivo es un directorio.
	 */
	public static boolean isDirectory(String path, String file){
		if(new File(path+"/"+file).isDirectory())
		{
			return true;
		}
		else{
			return false;
		}
		
	}
}
