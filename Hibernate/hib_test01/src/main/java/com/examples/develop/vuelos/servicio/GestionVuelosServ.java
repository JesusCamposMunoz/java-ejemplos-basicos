package com.examples.develop.vuelos.servicio;

import java.util.Date;
import java.util.Set;

import test.hibernate.dominio.Vuelo;

public interface GestionVuelosServ {
	//Hacemos una interface porque no sabemos si será por web, tpv, etc ...
	
	Set<Vuelo> obtenerVuelos(String aeropuertoOrigen, 
							String aeropuertoDestino,
							Date dia);
	
	//Tendremos operaciones para registrar un nuevo vuelo, realizar otro tipo de consultas.
	

}
