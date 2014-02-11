package com.jesuscampos.fechas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AMorPM {

	public static void main(String[] args) {
		
		String hora = "03:45 a.m.";
		Pattern p = Pattern.compile("p.m.");
		Matcher m = p.matcher(hora);
		
		if(m.find()){
			System.out.println("AM");
		}
		else{
			System.out.println("PM");
		}
		
	}
}
