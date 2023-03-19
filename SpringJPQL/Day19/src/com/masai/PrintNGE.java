package com.masai;

public class PrintNGE {

	public static void main(String[] args) {
		int [] arr= {11,13,21,3};
		int l=arr.length;
		send(arr,l);

	}
	static void send(int [] arr,int n) {
		int next,i,j;
		for(i=0;i<n;i++) {
			next=-1;
			for(j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					next=arr[j];
					break;
				}
			}
			System.out.println(arr[i]+" -- "+next);
		}
	}

}
