package test.hibernate.app;

import java.util.Date;
import java.util.Set;

import test.hibernate.dominio.Vuelo;

import com.examples.develop.vuelos.servicio.GestionVuelosServ;
import com.examples.develop.vuelos.servicio.GestionVuelosServImpl;

public class AppReadTable {

	public static void main(String[] args) {
		GestionVuelosServ serv = new GestionVuelosServImpl();
		
		Set<Vuelo> v = serv.obtenerVuelos("Barcelona", "Barajas", new Date());
		
		System.out.println("-----------------------------------------------");
		for (Vuelo vuelo : v) {
			System.out.print(vuelo.getAeropuertoOrigen().toString());
			System.out.print("	"+vuelo.getAeropuertoDestino().toString());
			System.out.print("	"+vuelo.getCiudadOrigen().toString());
			System.out.print("	"+vuelo.getCiudadDestino().toString());
			System.out.print("	"+vuelo.getPlazas());
			System.out.print("	"+vuelo.getPlazasLibres());
			System.out.print("	"+vuelo.getPartida().toString());
			System.out.print("	"+vuelo.getLlegada().toString());
			System.out.print("	"+vuelo.getPrecio());
			System.out.println("	"+"********************************************");
		}
		
		System.out.println("-----------------------------------------------");
	}
	
}
