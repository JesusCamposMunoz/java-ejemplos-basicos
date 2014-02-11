package com.jesuscampos.fechas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StringToFechaWs {

	public static void main(String[] args) {
		String fechaWS = "Lunes 10 de Febrero del 2014";
		
		String t[] = fechaWS.split("\\s");
		
		for(String str: t)
			    System.out.println(str);
		
		t[4]="de";
		
		for(String str: t)
		    System.out.println(str);
		
		fechaWS="";
		for(String str: t)
			fechaWS = fechaWS+" "+str;
		
		System.out.println(fechaWS);
		fechaWS=fechaWS.trim();
		
		try{
			DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, new Locale("es"));
			Date dtemp = df.parse(fechaWS);
			
			DateFormat df2 = DateFormat.getInstance();
			System.out.println(df2.format(dtemp));
			
			fechaWS=df2.format(dtemp).substring(0,9)+ "03:08 pm";
			System.out.println(fechaWS);
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm a", new Locale("es", "ES"));
			Date de = sdf.parse(fechaWS);
//			System.out.println("PM-"+de.toString());
			Calendar c =Calendar.getInstance();
			c.setTime(de);
//			System.out.println("CALENDAR: "+c.getTime());
			SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE d MMMM  yyyy   HH:mm:ss");
			System.out.println("FORMATED CALENDAR: "+dateFormat.format(c.getTime()));
		}catch(ParseException e){
			System.out.println("La excepcion que debia ocurrir");
			
		}
		
	}
}
