package Day4.src.main.java.Main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import org.hibernate.internal.build.AllowSysOut;

import Day4.src.main.java.Model.Collage;
import Day4.src.main.java.Model.Student;
import Day4.src.main.java.Utility.EMUtil;



public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManager em=EMUtil.provideEM();
		System.out.println("Enter 1 to enter the Details!");
		System.out.println("Enter 2 get all the Student details based on collageId!");
		System.out.println("Enter 3 get the Collage details based on studentRoll!");
		int x=sc.nextInt();
	if(x==1) {

	}else if(x==2) {
		System.out.println("Enter the collageID !");
		int cid=sc.nextInt();
		Collage c1=em.find(Collage.class, cid);
		List<Student> lis=c1.getLi();
		lis.forEach(e1-> System.out.println("Student Name is "+e1.getStudentName()+ "\n"+"Student EmailId is "+e1.getEmail()+"\n"+"Student Contact Number is "+e1.getMobileNumber()+"\n"+"Student Roll Number is "+e1.getStudentRoll()+"\n"+"=============================================="));
//		lis.forEach(e1->{if(e1.getStudentRoll()>2) { System.out.println(e1.toString()); }});
		Main.main(args);
	}else if(x==3) {
		System.out.println("Enter The Student Roll Number !");
		int sroll=sc.nextInt();
		Student c1=em.find(Student.class,sroll);
		System.out.println(c1.getColl().toString());
	}else {
		System.out.println("wrong Credential please enter the vaild input again !");
		Main.main(args);
	}
//Collage coll=new Collage();
//
//
//coll.setCollageName("BBD LUCKNOW");
//coll.setCollageAddress("LUCKNOW");
//Student s1=new Student();
//s1.setStudentName("Prince");
//s1.setMobileNumber("996633210");
//s1.setEmail("princ@gmail.com");
//s1.setColl(coll);
//Student s2=new Student();
//s2.setStudentName("Harshita");
//s2.setMobileNumber("9439063637");
//s2.setEmail("harshita@gmail.com");
//s2.setColl(coll);
//Student s3=new Student();
//s3.setStudentName("Rishika");
//s3.setMobileNumber("8695252629");
//s3.setEmail("rishika@gmail.com");
//s3.setColl(coll);
//Student s4=new Student();
//s4.setStudentName("Shivam");
//s4.setMobileNumber("968521470");
//s4.setEmail("shivam@gmail.com");
//s4.setColl(coll);
//coll.getLi().add(s1);
//coll.getLi().add(s2);
//coll.getLi().add(s3);
//coll.getLi().add(s4);
//
//em.getTransaction().begin();
//em.persist(coll);
//em.getTransaction().commit();
//em.close();
//System.out.println("Done");
	}


}
