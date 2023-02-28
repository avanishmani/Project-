package Day1.src.main.java.Usecase;

import Day1.src.main.java.Dao.StateBankDaoImpl;
import Day1.src.main.java.Model.Account;

public class SaveAccount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account acc=new Account("Amt@gmail.com", "Deoria", 100000 ,"2018-12-14");
StateBankDaoImpl dao=new StateBankDaoImpl();
String msg=dao.saveAccount(acc);
System.out.println(msg);

	}
}
