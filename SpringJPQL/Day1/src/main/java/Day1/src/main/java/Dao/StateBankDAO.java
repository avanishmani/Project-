package Day1.src.main.java.Dao;

import Day1.src.main.java.Model.Account;

public interface StateBankDAO {
	Account findAccountById(int id);
	String saveAccount(Account account);
	String deleteAccountById(int id);
	String withdrawFromAccount(double amount,int accountId);
	String depositInAccount(double amount,int accountId);
}
