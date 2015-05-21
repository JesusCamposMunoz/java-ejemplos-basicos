package test.hibernate.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import test.hibernate.dominio.PersonaBasica;

public class RecoverData {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("data");
		//este data va relacionado con el: <persistence-unit name="data"> del persistance.xml
		
		EntityManager em = factory.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		PersonaBasica p1 = new PersonaBasica();
		p1.setDni("345666786T");
		p1.setEdad(83);
		p1.setNombre("Jesus");
		
		PersonaBasica p2 = new PersonaBasica();
		p2.setDni("345662286T");
		p2.setEdad(22);
		p2.setNombre("carlos gomez");
		
		PersonaBasica p3 = new PersonaBasica();
		p3.setDni("345663386T");
		p3.setEdad(33);
		p3.setNombre("jesús");
		
		PersonaBasica p4 = new PersonaBasica();
		p4.setDni("345234254Y");
		p4.setEdad(33);
		p4.setNombre("laura garcía");
		
					
		//Con persist hacemos que se guarde en la base d datos. No podemos hacer persist de objetos que ya existen.
		//Le decimos que se acuerde de guardar tal cosa en memoria.
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		
		tx.commit();	//Consolidar datos en la Base de Datos.
		//Commit sincroniza bd con memoria.
		em.close();
		
	}
}
