package com.BinarySearch;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number for which you want Square root !");
		int n=sc.nextInt();
		System.out.println(sqt(n));

	}
	static int sqt (int x) {
		 long r = x;
    while (r*r > x)
        r = (r + x/r) / 2;
    return (int) r;
	}

}
