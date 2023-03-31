package com.mr.tripathi.model;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class Student {
	@NotNull(message = "Roll No must be Field !")
	private Integer roll;
	@Size(min=2,max=20, message = "Batch name should be with in 2 to 20 charcater !")
	private String batch;
	private Integer Marks;
	@Past(message = "Date Shoul be within current date")
	private LocalDateTime lt;
	public Student(@NotNull(message = "Roll No must be Field !") Integer roll,
			@Size(min = 2, max = 20, message = "Batch name should be with in 2 to 20 charcater !") String batch,
			Integer marks, @Past(message = "Date Shoul be within current date") LocalDateTime lt) {
		super();
		this.roll = roll;
		this.batch = batch;
		Marks = marks;
		this.lt = lt;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public Integer getMarks() {
		return Marks;
	}
	public void setMarks(Integer marks) {
		Marks = marks;
	}
	public LocalDateTime getLt() {
		return lt;
	}
	public void setLt(LocalDateTime lt) {
		this.lt = lt;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", batch=" + batch + ", Marks=" + Marks + ", lt=" + lt + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Marks, batch, lt, roll);
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
		return Objects.equals(Marks, other.Marks) && Objects.equals(batch, other.batch) && Objects.equals(lt, other.lt)
				&& Objects.equals(roll, other.roll);
	}
	
}
