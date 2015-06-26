package com.jesuscamposmunoz.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//Expresa la fecha actual
		System.out.println(cal.getTime());
		
		//Parseamos una fecha:
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = "01/08/2014";
		try {
			Date fecha = sdf.parse(str);
			System.out.println(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
