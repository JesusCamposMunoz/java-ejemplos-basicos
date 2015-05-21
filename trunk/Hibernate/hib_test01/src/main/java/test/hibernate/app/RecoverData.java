package test.hibernate.app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import test.hibernate.dominio.PersonaBasica;
import test.hibernate.dominio.Vuelo;


public class RecoverData {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("data");
		//El EntityManager es un recurso, equivale a una conexión a BD.
		
		//Ahora, aunque la tabla se llame vuelos, aviones o como sea, lo que busca son objetos que cumplan con estas características.
		
		String jpql = "select p "
				+"from PersonaBasica as p "
				+"where p.nombre = :n"; //:origen es como los interrogante de JDBC.
//				+"	and v.partida <= :dia"	//Uso de fechas
//				+"	and v.llegada > :diaPosterior";
		
		EntityManager em = null;
		try{
			em = factory.createEntityManager();
//			List<PersonaBasica> personas = em.createQuery(jpql).getResultList(); //Para conseguir todos.
			List<PersonaBasica> personas = em.createQuery(jpql)
					.setParameter("n", "jesús")
					.getResultList();
			
			Set<PersonaBasica> personasSet = new HashSet<PersonaBasica>();
			personasSet.addAll(personas);
			
			System.out.println("-----------------------------------------------");
			for (PersonaBasica pers : personasSet) {
				System.out.print(pers.getNombre().toString());
				System.out.print("	"+pers.getEdad());
				System.out.println("	"+pers.getDni());
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
