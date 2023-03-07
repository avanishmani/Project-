package Day7.src.main.java.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo; 
	private String name ;
	private String email ;
	private String mobile;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Cid")
	 private Course courseId;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	public Course getCourseId() {
		return courseId;
	}
	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}
	public Student(int rollNo, String name, String email, String mobile, Course courseId) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.courseId = courseId;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", courseId=" + courseId + "]";
	}


}
