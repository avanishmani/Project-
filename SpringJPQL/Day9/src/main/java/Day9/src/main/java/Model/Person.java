package Day9.src.main.java.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int person_id; 
	private String name ;
	private String email ;
	private String mobile;
	@ManyToMany(cascade = CascadeType.ALL)
	List<Gym>gli=new ArrayList<>();
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", gli=" + gli + "]";
	}

	public List<Gym> getGli() {
		return gli;
	}

	public void setGli(List<Gym> gli) {
		this.gli = gli;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getPerson_id() {
		return person_id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Person( String name, String email, String mobile) {
		super();

		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
}
