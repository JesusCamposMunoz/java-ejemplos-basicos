package com.jesuscampos.fechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AbreviacionDiasSemana {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		 Date dataInici = null;
		 
		 try
		 {
			 // dataFi = sdf.parse("02/4/2014")
			  Calendar cal = Calendar.getInstance();
			 // cal.setTime(dataFi)
			  //Fixem hores, minuts, segons, perquè al fer la comparació sigui l'última hora del dia
			  cal.set(Calendar.HOUR_OF_DAY, 23);
			  cal.set(Calendar.MINUTE, 59);
			  cal.set(Calendar.SECOND, 59);
			  cal.set(Calendar.YEAR, 2034);
			  cal.set(Calendar.MONTH, 11);	//el mes va de 0 a 11.
			  cal.set(Calendar.DAY_OF_MONTH, 13);	
			  //Tornar a alimentar l'objecte Date
			  //dataFi = cal.getTime();
			  System.out.println("Calendario: "+ sdf.format(cal.getTime()));
			  System.out.println("NEW DATE: "+new Date());
			  if(cal.getTime().after(new Date()))
			  {
				  System.out.println( "Estamos a TIEMPO!!!!");
			  }
			  else
			  {
				  System.out.println("Hemos pasado la fecha");
			  }
			  
			  dataInici = sdf.parse("01/4/2014");
			  
		 }
		 catch(Exception e){}
	}
}
