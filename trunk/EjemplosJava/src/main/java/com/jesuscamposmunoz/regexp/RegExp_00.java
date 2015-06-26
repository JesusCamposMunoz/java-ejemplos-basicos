package com.jesuscamposmunoz.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp_00 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("aba");
		Matcher m = p.matcher("abababa");
		//					   0123456
		boolean b = false;
		while(b=m.find()){
			System.out.println(m.start());
			//Indica dónde empiezan las coincidencias, sin solapamientos entre ellas.
			//Un búsqueda regex se realiza de izquierda a derecha, y una vez que un carácter ha sido utilizado en una
			//ocurrencia ya no puede ser utilizado en otra. Una forma de entenderlo es que el carácter ya se ha consumido.
		}
	}
}
