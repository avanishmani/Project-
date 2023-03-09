package Day9.src.main.java.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trainer_id;
	private String trainer_name;
	private int year_of_experience;
	private String email;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Gym>gli=new ArrayList<Gym>();
	public List<Gym> getGli() {
		return gli;
	}
	public void setGli(List<Gym> gli) {
		this.gli = gli;
	}
	public Trainer() {

	}
	@Override
	public String toString() {
		return "Trainer [trainer_id=" + trainer_id + ", trainer_name=" + trainer_name + ", year_of_experience="
				+ year_of_experience + ", email=" + email + "]";
	}
	public int getTrainer_id() {
		return trainer_id;
	}

	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}
	public int getYear_of_experience() {
		return year_of_experience;
	}
	public void setYear_of_experience(int year_of_experience) {
		this.year_of_experience = year_of_experience;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Trainer( String trainer_name, int year_of_experience, String email) {
		super();

		this.trainer_name = trainer_name;
		this.year_of_experience = year_of_experience;
		this.email = email;
	}
}
