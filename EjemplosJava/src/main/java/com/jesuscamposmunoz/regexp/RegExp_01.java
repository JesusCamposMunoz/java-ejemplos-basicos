package com.jesuscamposmunoz.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp_01 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\w");	//un car�cter de palabra (letras, d�gitos o _)
		Matcher m = p.matcher("a 1 56 _z");
		//					   012345678
		boolean b = false;
		while(b=m.find()){
			System.out.println(m.start());
			//Indica d�nde empiezan las coincidencias, sin solapamientos entre ellas.
			//Un b�squeda regex se realiza de izquierda a derecha, y una vez que un car�cter ha sido utilizado en una
			//ocurrencia ya no puede ser utilizado en otra. Una forma de entenderlo es que el car�cter ya se ha consumido.
		}
	}
}
