package Day7.src.main.java.Dao;

import Day7.src.main.java.Exception.StException;
import Day7.src.main.java.Model.Course;

public interface Model {
	public void addCourse(Course course);
	public void getStudent(int roll_no) throws StException;
	public void getCourse(int course_id) throws StException;
}
