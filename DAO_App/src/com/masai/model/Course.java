package com.masai.model;

public class Course {
	@Override
	public String toString() {
		return "Course [cname=" + cname + ", duration=" + duration + "]";
	}

	private String cname;
	private String duration;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
}
