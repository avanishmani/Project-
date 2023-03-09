package Day9.src.main.java.Main;

import java.util.Scanner;

import Day9.src.main.java.Dao.FitnessDao;
import Day9.src.main.java.Dao.FitnessDaoImpl;
import Day9.src.main.java.Exception.GymException;
import Day9.src.main.java.Exception.TrainerException;
import Day9.src.main.java.Model.Gym;
import Day9.src.main.java.Model.Person;
import Day9.src.main.java.Model.Trainer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		FitnessDao f1=new FitnessDaoImpl();
System.out.println("Enter 1 to add Gym");
System.out.println("Enter 2 to Register person to a Gym");
System.out.println("Enter 3 to Register A trainer");
System.out.println("Enter 4 to Assign Trainer With Gym");
System.out.println("Enter 5 to Get All The Person By GymName");
int x=sc.nextInt();

if(x==1) {
	Gym  g1=new Gym();
	System.out.println("Enter Gym Name !");
	String name=sc.next();
	g1.setGym_name(name);
	System.out.println("Enter Gym Fee !");
	int fee=sc.nextInt();
	g1.setMonthly_fee(fee);

	f1.addGym(g1);
}else if(x==2) {
	Person p1=new Person();
	System.out.println("Enter Person Email !");
	String email=sc.next();
	p1.setEmail(email);
	System.out.println("Enter Person Conatct Number !");
	String Mob=sc.next();
	p1.setMobile(Mob);
	System.out.println("Enter Person Name !");
	String Name=sc.next();
	p1.setName(Name);
	System.out.println("enter GymID ");
	int id=sc.nextInt();
	try {
		f1.registerPerson(p1, id);
	} catch (GymException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
}else if(x==3) {
	Trainer t1=new Trainer();
	System.out.println("Enter Trainer Name !");
	String name=sc.next();
	t1.setTrainer_name(name);
	System.out.println("Enter Trainer Email !");
	String email=sc.next();
	t1.setEmail(email);
	System.out.println("Enter How Many Year Of experince !");
	int year=sc.nextInt();
	t1.setYear_of_experience(year);
	f1.registerTrainer(t1);
}else if(x==4) {

	System.out.println("enter The Trainer Id ");
	int tid= sc.nextInt();
	System.out.println("enter The Gym Id ");
	int gid= sc.nextInt();

	try {
		f1.assignTrainerWithGym(tid, gid);
	} catch (TrainerException | GymException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
}
	}



}
