package Day5.src.main.java.Main;

import java.util.Scanner;

import javax.persistence.EntityManager;

import Day5.src.main.java.Model.Address;
import Day5.src.main.java.Model.Customers;
import Day5.src.main.java.utility.EMUtil;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter home State !");
		String s1=sc.next();
		System.out.println("Enter home city");
		String c1=sc.next();
		System.out.println("Enter home Pincode");
		String p1=sc.next();
		
		Address home=new Address(s1, c1, p1);
		System.out.println("Enter office State !");
		String s2=sc.next();
		System.out.println("Enter office city");
		String c2=sc.next();
		System.out.println("Enter office Pincode");
		String p2=sc.next();

		Address office=new Address(s2, c2, p2);
		System.out.println("Enter Customer Name");
		String n=sc.next();
		System.out.println("Enter Customer Mobile Number");
		int m=sc.nextInt();
		System.out.println("Enter Customer Email-ID !");
		String E=sc.next();
		Customers cus=new Customers();
		cus.setName(n);
		cus.setMobileNumber(m);
		cus.setEmail(E);
		cus.getAddresses().add(home);
		cus.getAddresses().add(office);
		EntityManager em=EMUtil.provideEM();
		em.getTransaction().begin();
		em.persist(cus);
		em.getTransaction().commit();
		System.out.println("Done!");
		em.close();
		
	}

}
