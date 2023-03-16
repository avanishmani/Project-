package com.Masai;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number for fibbnochie ! ");
	int n=sc.nextInt();
	System.out.println(send(n));
}
public static int send(int n) {
	if(n==0 || n==1) {
		return 1;
	}
	return send(n-1)+send(n-2);
}
}
