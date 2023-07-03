package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr= {12,32,45,34,87,1,5,-5};
		int[] ans=send(arr);
		for(Integer i: ans) {
			System.out.print(i+" ");
		}

	}
	public static int[] send(int[] arr){
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
					
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}

}
