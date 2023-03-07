package Day8.src.main.java.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	private static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("PhoneNumber");
	}
	public static EntityManager provideEM() {
		return emf.createEntityManager();
	}
}
