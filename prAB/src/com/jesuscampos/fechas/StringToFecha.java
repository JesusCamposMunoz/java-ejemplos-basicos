package com.jesuscampos.fechas;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StringToFecha {
	public static void main(String[] args) {
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, new Locale("es"));
		String s = df.format(d);
		System.out.println(s);
		
		try{
//			Date da = df.parse("Lunes 10 de Febrero del 2014");
			Date de = df.parse("Lunes 10 de Febrero de 2014");
			System.out.println("-"+de.toString());
			DateFormat df2 = DateFormat.getInstance();
			System.out.println(df2.format(de));
//			System.out.println("---> : "+df2.format(de.toString()));
		}catch(ParseException e){
			System.out.println("La excepcion que debia ocurrir");
			
		}
		
		//Correcto parsear con hora formato am/pm.
		String fecha ="10/02/14 11:46 pm";
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm a", new Locale("es", "ES"));
			Date de = sdf.parse(fecha);
			System.out.println("PM-"+de.toString());
			System.out.println(""+df.format(de));
			Calendar c =Calendar.getInstance();
			c.setTime(de);
			System.out.println("CALENDAR: "+c.getTime());
			c.add(Calendar.HOUR, 3);
			System.out.println("CALENDAR: "+c.getTime());
			System.out.println("CALENDAR: "+df.format(c.getTime()) + " a las ");
			SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE d MMMM  yyyy   HH:mm:ss");
			System.out.println("FORMATED CALENDAR: "+dateFormat.format(c.getTime()));
			c.add(Calendar.HOUR, 11);
			System.out.println("FORMATED CALENDAR: "+dateFormat.format(c.getTime()));
		}catch(ParseException e){
			System.out.println("La excepcion que debia ocurrir");
			
		}
		
		
		String hora = "11:46:35";
		java.sql.Time Time = null;
		try{
		     SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss", new Locale("es", "ES"));
		     Time = new Time(sdf.parse(hora).getTime());
		     d=(Date) sdf.parse(hora);
		     System.out.println("Hora con el formato java.sql.Time: "+Time+" Date:"+d.toString());
		}
		catch(Exception ex){
		     ex.printStackTrace();
		}
		
		String hora2 = "10:46 pm";
		java.sql.Time Time2 = null;
		try{
		     SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm a", new Locale("es", "ES"));
		     Time2 = new Time(sdf2.parse(hora2).getTime());
		     System.out.println("Hora con el formato java.sql.Time: "+Time2);
		}
		catch(Exception ex){
		     ex.printStackTrace();
		}
		
//		  Date d1 = new Date(1000000000000L);
//		  
//		  DateFormat[] dfa = new DateFormat[6];
//		  dfa[0] = DateFormat.getInstance();
//		  dfa[1] = DateFormat.getDateInstance();
//		  dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
//		  dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
//		  dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
//		  dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
//		 
//		  for(DateFormat dft : dfa)
//		    System.out.println(dft.format(d1));
		
	}

}
