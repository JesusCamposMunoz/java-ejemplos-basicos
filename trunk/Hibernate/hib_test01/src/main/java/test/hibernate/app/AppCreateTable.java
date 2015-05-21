package test.hibernate.app;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import test.hibernate.dominio.Vuelo;


public class AppCreateTable {

	public static void main(String[] args) throws Exception{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("data");
		//este data va relacionado con el: <persistence-unit name="data"> del persistance.xml
		
		EntityManager em = factory.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Calendar calendario = Calendar.getInstance();
		
		Vuelo vuelo = new Vuelo();
		vuelo.setAeropuertoDestino("Barajas");
		vuelo.setCiudadDestino("Madrid");
		vuelo.setAeropuertoOdigen("Barcelona");
		vuelo.setCiudadOrigen("Barcelona");
		vuelo.setPartida(new Date());
		calendario.setTime(new Date());
		calendario.add(Calendar.DATE, 9);
		vuelo.setLlegada(calendario.getTime());
		vuelo.setPlazas(200);
		vuelo.setPrecio(new BigDecimal(60.0));
		
		Vuelo vuelo0 = new Vuelo();
		vuelo0.setAeropuertoDestino("Barajas");
		vuelo0.setCiudadDestino("Madrid");
		vuelo0.setAeropuertoOdigen("Barcelona");
		vuelo0.setCiudadOrigen("Barcelona");
		vuelo0.setPartida(new Date());
		calendario.setTime(new Date());
		calendario.add(Calendar.DATE, 5);
		vuelo0.setLlegada(calendario.getTime());
		vuelo0.setPlazas(200);
		vuelo0.setPrecio(new BigDecimal(60.0));
		
		Vuelo vuelo1 = new Vuelo();
		vuelo1.setAeropuertoDestino("PSG");
		vuelo1.setCiudadDestino("París");
		vuelo1.setAeropuertoOdigen("Barcelona");
		vuelo1.setCiudadOrigen("Barcelona");
		vuelo1.setPartida(new Date());
		calendario.setTime(new Date());
		calendario.add(Calendar.DATE, 2);
		vuelo1.setLlegada(calendario.getTime());
		vuelo1.setPlazas(200);
		vuelo1.setPrecio(new BigDecimal(200.0));
		
		Vuelo vuelo2 = new Vuelo();
		vuelo2.setAeropuertoDestino("HVN Int");
		vuelo2.setCiudadDestino("Havana");
		vuelo2.setAeropuertoOdigen("Barcelona");
		vuelo2.setCiudadOrigen("Barcelona");
		calendario.setTime(new Date());
		calendario.add(Calendar.DATE, 1);
		vuelo2.setPartida(calendario.getTime());
		vuelo2.setLlegada(new Date());
		vuelo2.setPlazas(200);
		vuelo2.setPrecio(new BigDecimal(600.0));
		
		Vuelo vuelo3 = new Vuelo();
		vuelo3.setAeropuertoDestino("HVN 2 Int");
		vuelo3.setCiudadDestino("Havana");
		vuelo3.setAeropuertoOdigen("Barcelona2");
		vuelo3.setCiudadOrigen("Barcelona2");
		calendario.add(Calendar.DATE, 3);
		vuelo3.setPartida(calendario.getTime());
		calendario.add(Calendar.DATE, 7);
		vuelo3.setLlegada(calendario.getTime());
		vuelo3.setPlazas(200);
		vuelo3.setPrecio(new BigDecimal(6000.0));
		
		
		//Con persist hacemos que se guarde en la base d datos. No podemos hacer persist de objetos que ya existen.
		//Le decimos que se acuerde de guardar tal cosa en memoria.
		em.persist(vuelo);
		em.persist(vuelo0);
		em.persist(vuelo1);
		em.persist(vuelo2);
		em.persist(vuelo3);

		tx.commit();	//Consolidar datos en la Base de Datos.
		//Commit sincroniza bd con memoria.
		em.close();
		
	}
}
