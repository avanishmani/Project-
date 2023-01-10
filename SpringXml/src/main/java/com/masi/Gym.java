package com.masi;

import org.springframework.stereotype.Service;

@Service
public class Gym {
	
	

	private int gym_id;
	private String gym_name ;
	
	public Gym() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Gym [gym_id=" + gym_id + ", gym_name=" + gym_name + ", monthly_fee=" + monthly_fee + "]";
	}
	private int monthly_fee;
	public Gym(int gym_id, String gym_name, int monthly_fee) {
		super();
		this.gym_id = gym_id;
		this.gym_name = gym_name;
		this.monthly_fee = monthly_fee;

}
}
