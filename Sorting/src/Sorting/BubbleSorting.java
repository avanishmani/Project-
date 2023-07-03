package Sorting;

public class BubbleSorting {

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
			
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		return arr;
	}
}
