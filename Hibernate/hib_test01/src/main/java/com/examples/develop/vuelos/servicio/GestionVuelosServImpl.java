package com.examples.develop.vuelos.servicio;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import test.hibernate.dominio.Vuelo;

public class GestionVuelosServImpl implements GestionVuelosServ {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("data");
	//El EntityManager es un recurso, equivale a una conexi�n a BD.
	
	private Date calcularSiguienteDia(Date dia){
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dia);
		calendario.add(Calendar.DATE, 1);	//S�male 1 d�a.
		//Ahora establezco la hora a 00:00:00 horas
		calendario.add(Calendar.HOUR, 0);
		calendario.add(Calendar.MINUTE, 0);
		calendario.add(Calendar.SECOND, 0);
		return calendario.getTime();
	}
	
	private Date calcularAnteriorDia(Date dia){
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dia);
		calendario.add(Calendar.DATE, -1);	//S�male 1 d�a.
		//Ahora establezco la hora a 00:00:00 horas
		calendario.add(Calendar.HOUR_OF_DAY, 0);
		calendario.add(Calendar.MINUTE, 0);
		calendario.add(Calendar.SECOND, 0);
		return calendario.getTime();
	}
	
	public Set<Vuelo> obtenerVuelos(String aeropuertoOrigen,
			String aeropuertoDestino, Date dia) {
		//Ahora, aunque la tabla se llame vuelos, aviones o como sea, lo que busca son objetos que cumplan con estas caracter�sticas.
		
		String jpql = "select v "
				+"from Vuelo as v "
				+"where v.aeropuertoOrigen = :origen" //:origen es como los interrogante de JDBC.
				+"	and v.aeropuertoDestino = :destino"
				+"	and v.partida <= :dia"
				+"	and v.llegada > :diaPosterior";
		
		EntityManager em = null;
		try{
			em = factory.createEntityManager();
		//Aqu� no merece la pena tratar el error con un catch, porque aqu� no se si es apli de consola o GUI.
		//Tampos me dice que deba explicitarla, porque es una RuntimeException, una unchecked.
		//Pero si quiero puedo propagarla en el m�todo: throws PersistenciaException
		//ser�a el controlador el encargado de presentar el error
		//No tenemos capa de datos, porque utilizamos un EntityManager.
			List<Vuelo> vuelos = em.createQuery(jpql)
					.setParameter("origen", aeropuertoOrigen)
					.setParameter("destino", aeropuertoDestino)
					.setParameter("dia", dia)
					.setParameter("diaPosterior", calcularSiguienteDia(dia))
					.getResultList();
			
			//Esto tambi�n se pod�a hacer como:
			//List<Vuelo> vuelos = em.createNamedQuery(jpql);
			//em.setParameter("origen", aeropuertoOrigen);
			//Pero de este modo encadenamos como en un StringBuilder.
			
			Set<Vuelo> vueloSet = new HashSet<Vuelo>();
			vueloSet.addAll(vuelos);
			return vueloSet;
			
		}finally{
			//Nos asegura que si la parte del try va bien se cierra, y si no tambi�n.
			if(em != null){
				em.close();
			}
		}

	}

}
