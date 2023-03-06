package Day6.src.main.java.Main;

import java.util.Scanner;

import javax.persistence.EntityManager;

import Day6.src.main.java.Dao.StDao;
import Day6.src.main.java.Dao.StDaoImpl;
import Day6.src.main.java.Exception.UserException;
import Day6.src.main.java.Utility.EMUtil;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManager em=EMUtil.provideEM();
		System.out.println("Enter 1 For Entering the Details");
		System.out.println("Enter 2 For All the phone numbers of the user");
		int x=sc.nextInt();
		if(x==1) {
			StDao st1=new StDaoImpl();
			st1.AddUser();
		}else if(x==2) {
			System.out.println("Enter The User Id !");
			int id=sc.nextInt();
			StDao st1=new StDaoImpl();
			try {
				st1.GetAllPhone(id);
			} catch (UserException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}

		}else {
			System.out.println("Wrong Input !");
			Main.main(args);
		}
		// TODO Auto-generated method stub

	}
}
