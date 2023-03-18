package com.masai;

import java.util.Scanner;

public class BubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of the Array !");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter element inside the Array !");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Before Sorting !");
		for(int a=0;a<n;a++) {
			System.out.print(arr[a]+" ");
		}
		System.out.println();
		sort(arr);
	}
	public static void sort(int [] arr) {
		int l=arr.length;
		for(int i=0;i<l-1;i++) {
			for(int j=0;j<l-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array After Sorting !");
		for(int a=0;a<l;a++) {
			System.out.print(arr[a]+" ");
		}
		
	}

}
