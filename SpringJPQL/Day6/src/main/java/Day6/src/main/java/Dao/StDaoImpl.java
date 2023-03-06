package Day6.src.main.java.Dao;

import java.util.Set;

import javax.persistence.EntityManager;

import Day6.src.main.java.Exception.UserException;
import Day6.src.main.java.Model.PhoneNumber;
import Day6.src.main.java.Model.User;
import Day6.src.main.java.Utility.EMUtil;

public class StDaoImpl implements StDao {

	EntityManager em=EMUtil.provideEM();
	@Override
	public void AddUser() {
		// TODO Auto-generated method stub
		User u1=new User();
		u1.setUserName("Prateek");
		u1.setEmailid("prateek@masaischool.com");
		u1.getPno().add(new PhoneNumber(1, "9451269954", "Home"));
		u1.getPno().add(new PhoneNumber(2, "8604232313", "LandLine"));
		u1.getPno().add(new PhoneNumber(3, "9450556595", "Office"));
		User u2=new User();
		u2.setUserName("Nrupul");
		u2.setEmailid("Nrupul@masaischool.com");
		u2.getPno().add(new PhoneNumber(1, "7859624130", "Home"));
		u2.getPno().add(new PhoneNumber(2, "9635842710", "LandLine"));
		u2.getPno().add(new PhoneNumber(3, "75412698391", "Office"));

		em.getTransaction().begin();
		em.persist(u1);
		em.persist(u2);
		em.getTransaction().commit();

		System.out.println("Done With Input!");	
	}

	@Override
	public void GetAllPhone(int id) throws UserException {
		// TODO Auto-generated method stub
		User u2=em.find(User.class, id);
		if(u2!=null) {
			Set< PhoneNumber> ph=u2.getPno();
			ph.forEach(e->System.out.println(e.getPhoneNumber()+" that number belong to  "+ e.getPhoneType()));
		}else {
			throw new UserException("User Not Found Exception");
//			("User Not Found Exception");
		}
	}

}
