package Day7.src.main.java.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String courseName; 
	private String duration;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "courseId")
	private List<Student>li=new ArrayList<Student>();
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", li=" + li
				+ "]";
	}
	public Course() {
		super();
	}
	public Course(int courseId, String courseName, String duration, List<Student> li) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.li = li;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public List<Student> getLi() {
		return li;
	}
	public void setLi(List<Student> li) {
		this.li = li;
	}
}