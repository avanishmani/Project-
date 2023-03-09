package Day9.src.main.java.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import Day9.src.main.java.Exception.GymException;
import Day9.src.main.java.Exception.TrainerException;
import Day9.src.main.java.Model.Gym;
import Day9.src.main.java.Model.Person;
import Day9.src.main.java.Model.Trainer;
import Day9.src.main.java.Utility.EMUtil;

public class FitnessDaoImpl implements FitnessDao {
	EntityManager em=EMUtil.provideEM();
	@Override
	public void addGym(Gym gym) {
		// TODO Auto-generated method stub
      em.getTransaction().begin();
      em.persist(gym);
      em.getTransaction().commit();
    System.out.println("Addition Of Gym Is Done !");
	}

	@Override
	public void registerPerson(Person person, int id) throws GymException {
		// TODO Auto-generated method stub
Gym g1=em.find(Gym.class, id);
if(g1!=null) {
	person.getGli().add(g1);
	g1.getLp().add(person);
	em.getTransaction().begin();
	em.persist(person);
	em.getTransaction().commit();
	System.out.println("Person Registration is Done to a Gym "+ g1.getGym_name());

}else {
	throw new GymException("No Such Gym is Avilable !");
}
	}

	@Override
	public void registerTrainer(Trainer trainer) {
		em.getTransaction().begin();
		em.persist(trainer);
		em.getTransaction().commit();
		System.out.println("Trainer Registration Done Succesgully !");

	}

	@Override
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException {
		// TODO Auto-generated method stub
          Trainer t1=em.find(Trainer.class, trainer_id);
          if(t1!=null) {
        	  Gym g1=em.find(Gym.class, gym_id);
        	  if(g1!=null) {
        		  t1.getGli().add(g1);
        		  em.getTransaction().begin();
        		  em.persist(g1);
        		  em.getTransaction().commit();
        		  System.out.println(t1.getTrainer_name()+" Trainer Assign to the gym "+g1.getGym_name());
        	  }else {
        		  throw new GymException("No Such Gym is There !");
        	  }
          }else {
        	  throw new TrainerException("No Such Trainer Exsist !");
          }
	}

	@Override
	public List<Person> getAllthePersonByGymName(String gym_name) throws GymException {
		// TODO Auto-generated method stub
		String jpql="from gym where gym_name="+gym_name;
		List<Person> lp=new ArrayList<>();
		return lp;
	}

}
