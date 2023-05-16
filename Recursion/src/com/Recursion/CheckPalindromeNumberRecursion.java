package com.Recursion;

import java.io.*;
import java.util.*;

public class CheckPalindromeNumberRecursion {

	// A function that returns true
	// only if num contains one digit
	public static int oneDigit(int num) {

		if ((num >= 0) && (num < 10))
			return 1;
		else
			return 0;
	}

	public static int isPalUtil(int num, int dupNum) throws Exception {

		// base condition to return once we
		// move past first digit
		if (num == 0) {
			return dupNum;
		} else {
			dupNum = isPalUtil(num / 10, dupNum);
		}

		// Check for equality of first digit of
		// num and dupNum
		if (num % 10 == dupNum % 10) {
			// if first digit values of num and
			// dupNum are equal divide dupNum
			// value by 10 to keep moving in sync
			// with num.
			return dupNum / 10;
		} else {
			// At position values are not
			// matching throw exception and exit.
			// no need to proceed further.
			throw new Exception();
		}

	}

	public static int isPal(int num) throws Exception {

		if (num < 0)
			num = (-num);

		int dupNum = (num);

		return isPalUtil(num, dupNum);
	}

	public static void main(String args[]) {

		int n = 1242;
		try {
			isPal(n);
			System.out.println("Yes");
		} catch (Exception e) {
			System.out.println("No");
		}
		n = 1231;
		try {
			isPal(n);
			System.out.println("Yes");
		} catch (Exception e) {
			System.out.println("No");
		}

		n = 12;
		try {
			isPal(n);
			System.out.println("Yes");
		} catch (Exception e) {
			System.out.println("No");
		}

		n = 88;
		try {
			isPal(n);
			System.out.println("Yes");
		} catch (Exception e) {
			System.out.println("No");
		}

		n = 8999;
		try {
			isPal(n);
			System.out.println("Yes");
		} catch (Exception e) {
			System.out.println("No");
		}
	}
}
