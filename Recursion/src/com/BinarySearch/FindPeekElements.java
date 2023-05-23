package com.BinarySearch;

public class FindPeekElements {
	public static void main(String[] args) {
		int[] arr= {1,2,1,3,5,6,4};
		System.out.println(helper(arr,0,arr.length-1));
	}
	public static int helper(int[] num,int start,int end){

	    if(start == end){
	        return start;
	    }else if(start+1 == end){
	        if(num[start] > num[end]) return start;
	        return end;
	    }else{
	        
	        int m = (start+end)/2;
	        
	        if(num[m] > num[m-1] && num[m] > num[m+1]){

	            return m;

	        }else if(num[m-1] > num[m] && num[m] > num[m+1]){

	            return helper(num,start,m-1);

	        }else{

	            return helper(num,m+1,end);

	        }
	}
	}
}
