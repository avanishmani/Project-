package com.Recursion;

import java.util.Scanner;

public class MoneyCombination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array !");
		int n=sc.nextInt();
		System.out.println("enter the target ammount that You want to achieved !");
		int amt=sc.nextInt();
		System.out.println("Enter the coins Value inside the coins Array !");
		int[] coins=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Please Enter a valied Coin value ");
			coins[i]=sc.nextInt();
		}
		System.out.println(" total Possible combinatin is :- "+ send(amt,coins));

	}
	static int send(int n,int[] arr) {
		if(n==0)return 1;
		if(n<0) return 0;
		int sum=0;
		for(int i: arr) {
			sum+=send(n-i,arr);
		}
		return sum;
	}

}
