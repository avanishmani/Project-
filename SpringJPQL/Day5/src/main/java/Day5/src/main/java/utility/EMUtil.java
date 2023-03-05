package Day5.src.main.java.utility;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	private static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("HashATabale");
	}
	public static EntityManager provideEM() {
		return emf.createEntityManager();
	}
}
