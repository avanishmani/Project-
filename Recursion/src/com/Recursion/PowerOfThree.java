package com.Recursion;

import java.util.Scanner;

public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check is it a power of three our not !");
		int number=sc.nextInt();
		System.out.println(isPowerOfThree(number));
	}
	 static boolean isPowerOfThree(int n) {
		 if(n==1) return true;
		 if(n%3!=0) return false;
		 if(n<0)return false;
		 return isPowerOfThree(n/3);
	 }

}
