package com.masai.usecase;

import java.util.List;
import java.util.Scanner;

import com.masai.Dao.AccountDao;
import com.masai.Dao.AccountDaoImpl;
import com.masai.model.Account;

public class SearchAccByName {

	public static void main(String[] args) {
		AccountDao ad=new AccountDaoImpl();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Holder Name");
		String name=sc.next();
		List<Account> acc=ad.findByName(name);
		if(acc==null)
			System.out.println("Account Does not exsit");
		else {
			acc.forEach(e->{
				System.out.println(e);
				System.out.println("==========================================");
			});
		}

	}

}
