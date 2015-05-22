package test.hibernate.app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import test.hibernate.dominio.Persona;


public class RecoverData {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("data");
		//El EntityManager es un recurso, equivale a una conexión a BD.
		
		//Ahora, aunque la tabla se llame vuelos, aviones o como sea, lo que busca son objetos que cumplan con estas características.
		
		String jpql = "select p "
				+"from Persona as p ";
//				+"where p.nombre = :n"; //:origen es como los interrogante de JDBC.
//				+"	and v.partida <= :dia"	//Uso de fechas
//				+"	and v.llegada > :diaPosterior";
		
		EntityManager em = null;
		try{
			em = factory.createEntityManager();
			List<Persona> personas = em.createQuery(jpql).getResultList(); //Para conseguir todos.
//			List<Persona> personas = em.createQuery(jpql)
//					.setParameter("n", "Jesus")
//					.getResultList();
			
			Set<Persona> personasSet = new HashSet<Persona>();
			personasSet.addAll(personas);
			
			System.out.println("-----------------------------------------------");
			for (Persona pers : personasSet) {
				System.out.print(pers.getNombre().toString());
				System.out.print("	"+pers.getEdad());
				System.out.println("	"+pers.getDni());
				if(pers.getDrc()!=null){
					System.out.println("Dirección");
					System.out.println("    "+pers.getDrc().getCalle());
					System.out.println("    "+pers.getDrc().getNumero());
					System.out.println("    "+pers.getDrc().getZipCode());
					System.out.println(pers.getDrc().getPersona().getDni());
				}

				System.out.println("********************************************");
			}
			
			System.out.println("-----------------------------------------------");
			
		}finally{
			//Nos asegura que si la parte del try va bien se cierra, y si no también.
			if(em != null){
				em.close();
			}
		}
	}
}
