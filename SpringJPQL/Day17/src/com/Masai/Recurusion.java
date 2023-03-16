package com.Masai;

import java.util.Scanner;

public class Recurusion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number!");
		int n=sc.nextInt();
		printFun(n);
	}
	
		static void printFun(int test) {
			if(test<1) {
				return;
			}else {
				System.out.printf("%d",test);
				printFun(test-1);
				System.out.printf("%d",test);
				return;
			}
		

	}

}
