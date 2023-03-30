package com.mr.tripathi.model;

import java.util.Objects;

import lombok.Data;


public class Student {
	private Integer roll;
	private String name;
	private String course;
	private Integer year;
	public Student(Integer roll, String name, String course, Integer year) {
		super();
		this.roll = roll;
		this.name = name;
		this.course = course;
		this.year = year;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", course=" + course + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(course, name, roll, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && Objects.equals(name, other.name)
				&& Objects.equals(roll, other.roll) && Objects.equals(year, other.year);
	}
	
}
