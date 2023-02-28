package Day1.src.main.java.Usecase;

import Day1.src.main.java.Dao.StateBankDAO;
import Day1.src.main.java.Dao.StateBankDaoImpl;

public class Withdraw {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateBankDAO st=new StateBankDaoImpl();
		String msg=st.withdrawFromAccount(2500, 3);
		System.out.println(msg);
	}
}
