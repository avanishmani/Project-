package com.BinarySearch;

public class SearchInRotedSorted {

	public static void main(String[] args) {
		int[] array= {2,5,6,0,0,1,2};
		int target=3;
		System.out.println(send(array,target));

	}
	 static boolean send(int[] array,int target) {
		 int start=0;
		 int end=array.length-1;
		 while(start<=end) {
			 int mid=start+(end-start)/2;
			 if(array[mid]==target) {
				 return true;
			 }
			 if(array[mid]<array[end]||array[mid]<array[start]) {
				 if(target>array[mid] && target<=array[end]) {
					 start=mid+1;
				 }else {
					 end=mid-1;
				 }
			 }else if(array[mid]>start||array[mid]>array[end]) {
				 if(target<array[mid]&& target>=array[start]) {
					 end=mid-1;
				 }else {
					 start=mid+1;
				 }
			 }else {
				 end--;
			 }
		 }
		 return false;
	 }

}
