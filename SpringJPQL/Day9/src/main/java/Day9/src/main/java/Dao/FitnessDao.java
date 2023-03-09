package Day9.src.main.java.Dao;

import java.util.List;

import Day9.src.main.java.Exception.GymException;
import Day9.src.main.java.Exception.TrainerException;
import Day9.src.main.java.Model.Gym;
import Day9.src.main.java.Model.Person;
import Day9.src.main.java.Model.Trainer;

public interface FitnessDao {
	public void addGym(Gym gym);
	public void registerPerson(Person person, int id)throws GymException;
	public void registerTrainer(Trainer trainer);
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException,GymException;
	public List<Person> getAllthePersonByGymName(String gym_name)throws GymException;
}
