package Day1.src.main.java.Usecase;

import Day1.src.main.java.Dao.StateBankDAO;
import Day1.src.main.java.Dao.StateBankDaoImpl;
import Day1.src.main.java.Model.Account;

public class FindAccount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StateBankDAO st=new StateBankDaoImpl();
Account ss=st.findAccountById(2);
System.out.println(ss);
	}
}
