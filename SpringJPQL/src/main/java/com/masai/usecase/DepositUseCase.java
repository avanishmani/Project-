package com.masai.usecase;

import java.util.Scanner;

import com.masai.Dao.AccountDao;
import com.masai.Dao.AccountDaoImpl;
import com.masai.model.Account;

public class DepositUseCase {

	public static void main(String[] args) {
		AccountDao ad=new AccountDaoImpl();
		Account a1=new Account();
		a1.setName("Avanish");
		a1.setBalance(100000);
		boolean f=ad.CreateAccount(a1);
		if(f)
			System.out.println("Account Created !");
		else
			System.out.println("Account not Created");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number");
		int ano=sc.nextInt();
		Account acc=ad.findAccount(ano);
		if(acc==null)
			System.out.println("Account Does not exsit");
		else {
			System.out.println("enter the amount to deposite !");
			int amt=sc.nextInt();
			acc.setBalance(acc.getBalance()+amt);
			boolean up=ad.UpdateAc(acc);
			if(up) System.out.println("Deposited successfully !");
			else System.out.println("Tecnical Error try letter !");
		}

	}

}
