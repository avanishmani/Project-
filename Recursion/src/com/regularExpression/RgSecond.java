package com.regularExpression;

import java.util.Scanner;

public class RgSecond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A valid Email Id");
		String email=sc.next();
		System.out.println("Enter a Valid Mobile Number");
		String mob=sc.next();
		boolean em= email.matches("^(.+)@(.+)$");
		boolean mo=mob.matches("[789][0-9]{9}");
		if(em&&mo) {
			System.out.println("Both are fine to add !");
		}else if(em==true &&mo==false) {
			System.out.println("email is Fine but Mobile no is not fine");
		}else {
			System.out.println("Mobile no is fine but email is not fine !");
		}
	}

}
