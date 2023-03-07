package Day8.src.main.java.UseCase;

import java.util.Scanner;

import javax.persistence.EntityManager;

import Day8.src.main.java.Model.FullTimeInstructor;
import Day8.src.main.java.Model.Instructor;
import Day8.src.main.java.Model.PartTimeInstructor;
import Day8.src.main.java.Utility.EMUtil;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter 1 to Add 4 part time And Full Time Emplloye");
		System.out.println("enter 2 to get all the FullTimeInstructor details inside FullTimeDemo class");
		System.out.println("enter 3 to get all the PartTimeInstructor details inside PartTimeDemo class");
		System.out.println("enter 4 to get the Full time Instructor having instructorId equal to x.");
		int x=sc.nextInt();
		if(x==1) {
			Main.ADD();
		}else {

			Main.main(args);
		}

	}
public static void ADD() {
	Scanner sc=new Scanner(System.in);
	EntityManager em=new EMUtil().provideEM();

	for(int i=0;i<4;i++) {
		Instructor i1=new Instructor() ;
		System.out.println("Enter Instructor  Name");
		String name=sc.next();
		i1.setInstructorName(name);
		System.out.println(i+1 +" Instrcutor Data Enter ");
		FullTimeInstructor f1=new FullTimeInstructor();


		System.out.println("Enter Fulltime Instructor  email iD");
		String Email=sc.next();
		f1.setEmail(Email);
		System.out.println("Enter Fulltime Instructor  Sallary");
		int sal=sc.nextInt();
		f1.setSalary(sal);

		System.out.println(i+1 +" Full Time Employee Data Enter ");

		PartTimeInstructor p1=new PartTimeInstructor();




		System.out.println("Enter Parttime  Instructor  Contact NUmber");
		String Num=sc.next();
		p1.setMobileNumber(Num);
		System.out.println("Enter Parttime Instructor  Cost Per Session");
		int cps=sc.nextInt();
		p1.setCostPerSession(cps);
		System.out.println("Enter Parttime Instructor  Number Of Session");
		int nps=sc.nextInt();
		p1.setNoOfSession(nps);
		em.getTransaction().begin();
		em.persist(i1);
		em.persist(f1);
		em.persist(p1);
		em.getTransaction().commit();
		System.out.println(i+1 +" Part Time Employee Data Enter ");
	}
}
}
