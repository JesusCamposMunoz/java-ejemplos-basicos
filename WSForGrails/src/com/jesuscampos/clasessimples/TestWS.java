package com.jesuscampos.clasessimples;

import com.jesuscampos.domain.Dni;
import com.jesuscampos.domain.Persona;

public class TestWS {

	public String testMetodoWS(){
		return "WS de pruebas";
	}
	
	public String testMetodoWSParam(String variable){
		System.out.println(variable);
		String val = "WS de pruebas "+variable;
		return val;
	}
	
	public Persona testPersonaWS(){
		return new Persona("Personal", "PAS", "Laboral");
	}
	
	public Persona testPersonaWSObj(){
		return new Persona("Personal", "PAS", "L", new Dni(23423422 , "M"));
	}
}
