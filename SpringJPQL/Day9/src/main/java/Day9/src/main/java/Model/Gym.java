package Day9.src.main.java.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Gym {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gym_id; 
	private String gym_name; 
	private int monthly_fee;
	@ManyToOne(cascade = CascadeType.ALL)
	private Trainer train;
	@ManyToMany(cascade = CascadeType.ALL)
	List<Person>lp=new ArrayList<>();
	public List<Person> getLp() {
		return lp;
	}



	public void setLp(List<Person> lp) {
		this.lp = lp;
	}



	public Gym() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Gym [gym_id=" + gym_id + ", gym_name=" + gym_name + ", monthly_fee=" + monthly_fee + ", train=" + train
				+ "]";
	}



	public Trainer getTrain() {
		return train;
	}



	public void setTrain(Trainer train) {
		this.train = train;
	}



	public int getGym_id() {
		return gym_id;
	}

	public String getGym_name() {
		return gym_name;
	}
	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}
	public int getMonthly_fee() {
		return monthly_fee;
	}
	public void setMonthly_fee(int monthly_fee) {
		this.monthly_fee = monthly_fee;
	}
	public Gym( String gym_name, int monthly_fee) {
		super();

		this.gym_name = gym_name;
		this.monthly_fee = monthly_fee;
	}
}


