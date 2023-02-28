package Day1.src.main.java.Usecase;

import Day1.src.main.java.Dao.StateBankDaoImpl;

public class Deposite {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateBankDaoImpl st=new StateBankDaoImpl();
		String msg=st.depositInAccount(50000, 3);
		System.out.println(msg);
	}
}
