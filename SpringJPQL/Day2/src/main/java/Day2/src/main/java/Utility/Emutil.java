package Day2.src.main.java.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emutil {
	private static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("registerEmployee");
	}
	public static EntityManager provideEM() {
		return emf.createEntityManager();
	}
	}
