package test.hibernate.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import test.hibernate.dominio.PersonaBasica;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("data");
		//este data va relacionado con el: <persistence-unit name="data"> del persistance.xml
		
		EntityManager em = factory.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		

		
		
		//Commit sincroniza bd con memoria.
		em.close();
		
	}
}
