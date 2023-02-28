package Day1.src.main.java.Dao;

import javax.persistence.EntityManager;

import Day1.src.main.java.Model.Account;
import Day1.src.main.java.Utility.EMUtil;

public class StateBankDaoImpl implements StateBankDAO {

	@Override
	public Account findAccountById(int id) {
		// TODO Auto-generated method stub
		Account acc=null;
		EntityManager em=EMUtil.provideEM();
		acc=em.find(Account.class, id);
		return acc;
	}

	@Override
	public String saveAccount(Account account) {
		// TODO Auto-generated method stub
		String msg="Not Saved Data";
		EntityManager em=EMUtil.provideEM();

		em.getTransaction().begin();
		em.persist(account);
		msg="Account data Saved";
		em.getTransaction().commit();
		em.close();
		return msg;
	}

	@Override
	public String deleteAccountById(int id) {
		// TODO Auto-generated method stub
		String msg="Not Able to Delete";
		EntityManager em=EMUtil.provideEM();
		Account acc=em.find(Account.class, id);
		if(acc!=null) {
			em.getTransaction().begin();
			em.remove(acc);
			msg="Account Deleted Succesfully";
			em.getTransaction().commit();
		}
		em.close();
		return msg;
	}

	@Override
	public String withdrawFromAccount(double amount, int accountId) {
		// TODO Auto-generated method stub
		String msg="Not Able to withdraw";
		EntityManager em=EMUtil.provideEM();
		Account acc=em.find(Account.class, accountId);
		if(acc==null) {
			msg="Enter the Correct Account Number";
		}else {
			if(amount<=acc.getBalance()) {
				acc.setBalance(acc.getBalance()-amount);
				em.getTransaction().begin();
				em.merge(acc);
				msg="Withdraw Succefuuly";
				em.getTransaction().commit();
				em.close();
			}else {
				msg="Not Sufficent Fund !";
			}
		}
		return msg;
	}

	@Override
	public String depositInAccount(double amount, int accountId) {
		// TODO Auto-generated method stub
		String msg="Not Able to Deposite";
		EntityManager em=EMUtil.provideEM();
		Account acc=em.find(Account.class, accountId);
		if(acc==null) {
			msg="Enter the Correct Account Number";
		}else {

				acc.setBalance(acc.getBalance()+amount);
				em.getTransaction().begin();
				em.merge(acc);
				msg="Deposite Succefuuly";
				em.getTransaction().commit();
				em.close();

		}
		return msg;
	}

}
