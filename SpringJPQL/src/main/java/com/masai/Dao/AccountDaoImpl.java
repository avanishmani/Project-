package com.masai.Dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Account;
import com.masai.utility.Emutil;

import java.util.*;

public class AccountDaoImpl implements AccountDao {

	@Override
	public boolean CreateAccount(Account acc) {
		boolean flag=false;
		EntityManager em=Emutil.provideEM();
		em.getTransaction().begin();
		em.persist(acc);
		flag=true;
		em.getTransaction().commit();
		em.close();
		return flag;
	}

	@Override
	public boolean deleteAccount(int accNo) {
		boolean flag=false;
		EntityManager em=Emutil.provideEM();
		Account acc=em.find(Account.class, accNo);
		if(acc!=null) {
			em.getTransaction().begin();
			em.remove(acc);
			flag=true;
			em.getTransaction().commit();
			
		}
			em.close();
		return flag;
	}

	@Override
	public boolean UpdateAc(Account acc) {
		// TODO Auto-generated method stub
		boolean flag=false;
		EntityManager em=Emutil.provideEM();
		Account ac=em.find(Account.class, acc.getAccno());
		if(ac==null) {
			throw new IllegalArgumentException("Invalid Account Number");
		}else {
			em.getTransaction().begin();
			em.merge(acc);
			flag=true;
			em.getTransaction().commit();
		}
		em.close();
		return flag;
	}

	@Override
	public Account findAccount(int accno) {
		// TODO Auto-generated method stub
		Account acc=null;
	 EntityManager em=Emutil.provideEM();
	 acc=em.find(Account.class, accno);
		return acc;
	}

	@Override
	public List<Account> findByName(String name) {
		// TODO Auto-generated method stub
		List<Account> acc=null;
		String jpql="from Account where name=?1";
		EntityManager em=Emutil.provideEM();
		Query qu=em.createQuery(jpql);
		qu.setParameter(1, name);
		acc=qu.getResultList();
		
		
		return acc;
	}

	
}
