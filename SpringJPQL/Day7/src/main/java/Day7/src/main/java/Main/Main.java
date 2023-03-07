package Day7.src.main.java.Main;

import java.util.Scanner;

import Day7.src.main.java.Dao.Model;
import Day7.src.main.java.Dao.ModelImpl;
import Day7.src.main.java.Exception.StException;
import Day7.src.main.java.Model.Course;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1  add a course with the student details");
		System.out.println("enter 2  get student along with the course details");
		System.out.println("enter 3  get course details along with the details of all the students enrolled in this course");
		int x=sc.nextInt();
		if(x==1) {
			Model m1=new ModelImpl();
			Course c1=new Course();
			c1.setCourseName("java");
			c1.setDuration("30day");

			m1.addCourse(c1 );
		}else if(x==2) {
			Model m1=new ModelImpl();
			System.out.println("Enter The Student Roll Number");
			int roll=sc.nextInt();
			try {
				m1.getCourse(roll);
			} catch (StException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}else if(x==3) {
			Model m1=new ModelImpl();
			System.out.println("Enter The SCourse ID Number");
			int Cid=sc.nextInt();
			try {
				m1.getStudent(Cid);
			} catch (StException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
			}
}
