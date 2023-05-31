package com.General;

import java.util.Scanner;

public class firstMissing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array !");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the element inside Array !");
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+i+ " th element in array!");
			arr[i]=sc.nextInt();
		}
		System.out.println(firstMissingPositive(arr));

	}
	 public static int firstMissingPositive(int[] A) {
	        int i = 0;
	        while(i < A.length){
	            if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length) i++;
	            else if(A[A[i]-1] != A[i]) swap(A, i, A[i]-1);
	            else i++;
	        }
	        i = 0;
	        while(i < A.length && A[i] == i+1) i++;
	        return i+1;
	    }
	    
	    private static void swap(int[] A, int i, int j){
	        int temp = A[i];
	        A[i] = A[j];
	        A[j] = temp;
	    }

}
