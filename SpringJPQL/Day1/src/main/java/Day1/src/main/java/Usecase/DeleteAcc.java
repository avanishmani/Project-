package Day1.src.main.java.Usecase;

import Day1.src.main.java.Dao.StateBankDaoImpl;

public class DeleteAcc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StateBankDaoImpl dao=new StateBankDaoImpl();
String msg=dao.deleteAccountById(1);
System.out.println(msg);
	}
}
