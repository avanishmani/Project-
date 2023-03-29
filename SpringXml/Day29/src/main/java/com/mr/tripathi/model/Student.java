package com.mr.tripathi.model;

import jakarta.persistence.Entity;
import lombok.Data;


@Data
public class Student {
	
	private Integer RollNo;
	
	private String Name;
	
	private Course course;
	private String Address;
}
