package test.hibernate.app;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import test.hibernate.dominio.Direccion;
import test.hibernate.dominio.Persona;

public class GenerateData {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("data");
		//este data va relacionado con el: <persistence-unit name="data"> del persistance.xml
		
		EntityManager em = factory.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		Calendar calendario = Calendar.getInstance();
		
		Persona p1 = new Persona();
		p1.setDni("345666786T");
		p1.setEdad(83);
		p1.setNombre("Jesus");
		Direccion d1 = new Direccion();
		d1.setCalle("calle num 1");
		d1.setNumero(22);
		d1.setPais("ESP");
		d1.setZipCode("34432");
		p1.setDrc(d1);
		
		Persona p2 = new Persona();
		p2.setDni("345662286T");
		p2.setEdad(22);
		p2.setNombre("carlos gomez");
		Direccion d2 = new Direccion();
		d2.setCalle("calle num 2");
		d2.setNumero(232);
		d2.setPais("EnG");
		d2.setZipCode("13297");
		p2.setDrc(d2);
		
		
		Persona p3 = new Persona();
		p3.setDni("345663386T");
		p3.setEdad(33);
		p3.setNombre("jesús");
		calendario.setTime(new Date());
		calendario.add(Calendar.DATE, 1);
		p3.setFechaNacimiento(calendario.getTime());
		
		Persona p4 = new Persona();
		p4.setDni("345234254Y");
		p4.setEdad(33);
		p4.setNombre("laura garcía");
		calendario.setTime(new Date());
		calendario.add(Calendar.DATE, 9);
		p4.setFechaNacimiento(calendario.getTime());
		Direccion d4 = new Direccion();
		d4.setCalle("calle num 4");
		d4.setNumero(242);
		d4.setPais("E4G");
		d4.setZipCode("14447");
		p4.setDrc(d4);
					
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
