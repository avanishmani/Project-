package Day7.src.main.java.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Day7.src.main.java.Exception.StException;
import Day7.src.main.java.Model.Course;
import Day7.src.main.java.Model.Student;
import Day7.src.main.java.Utility.EMUtil;

public class ModelImpl implements Model {

	  EntityManager em= EMUtil.provideEM();
		@Override
		public void addCourse(Course course) {
			// TODO Auto-generated method stub

	                 Student s1=new Student();
	                 s1.setName("avanish");
	                 s1.setMobile("9876541230");	
	                 s1.setEmail("amt@gmail.com");
	             course.getLi().add(s1); 
	             s1.setCourseId(course);

	             em.getTransaction().begin();
	             em.persist(course);
	             em.persist(s1);
	             em.getTransaction().commit();
	             System.out.println("Done");
		}

		@Override
		public void getStudent(int roll_no) throws StException {
			// TODO Auto-generated method stub
	Student s1=em.find(Student.class, roll_no);
	if(s1!=null) {

		System.out.println(s1.getName()+ "\n"+s1.getEmail()+"\n"+s1.getMobile()+"\n"+s1.getRollNo());
	}else {
		throw new StException("No Such Student Exist !");
	}
		}

		@Override
		public void getCourse(int course_id) throws StException {
			// TODO Auto-generated method stub
	Course c1=em.find(Course.class, course_id);
	if(c1!=null) {
		System.out.println(c1.getCourseName()+" is a Course Name "+ c1.getDuration()+ " is the Course Duration" +"\n");
		List<Student>li=c1.getLi();
		li.forEach(l1-> System.out.println(l1.getName()+ "\n"+l1.getEmail()+"\n"+l1.getMobile()+"\n"+l1.getRollNo()));

	}else {
		throw new StException("No Such Course Exist !");
	}
		}

}
