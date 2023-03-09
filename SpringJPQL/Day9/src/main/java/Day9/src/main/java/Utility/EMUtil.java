package Day9.src.main.java.Utility;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.*;
public class EMUtil {
	private static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("Gym");
	}
	public static EntityManager provideEM() {
		return emf.createEntityManager();
	}
	
}
