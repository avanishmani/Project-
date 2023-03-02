package Day3.src.main.java.Utiltiy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emutil {
	private static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("Employee");
	}
	public static EntityManager provideEM() {
		return emf.createEntityManager();
	}
}
