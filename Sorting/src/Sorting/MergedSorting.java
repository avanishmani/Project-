package Sorting;

public class MergedSorting {

	public static void main(String[] args) {
		int [] arr= {12,32,45,34,87,1,5,-5};
		int n=arr.length-1;
		send(arr,0,n);
		for(Integer i: arr) {
			System.out.print(i+" ");
		}

	}
	public static void send(int[] arr,int s,int e){
		if(s<e) {
		int mid=s+(e-s)/2;
		send(arr,s,mid);
		send(arr,mid+1,e);
		merged(arr,s,mid,e);
		
}

		
	}
	static void merged(int[] arr, int s,int m,int e) {
		int temp[]=new int[e-s+1];
		int i=s;int j=m+1;int k=0;
		while(i<=m&&j<=e) {
			if(arr[i]<=arr[j]) {
				temp[k++]=arr[i++];
				
				
			}else {
				temp[k++]=arr[j++];
			}
		}
		while(i<=m) {
			temp[k++]=arr[i++];
		}
		while(j<=e) {
			temp[k++]=arr[j++];
		}
	for(i=s;i<=e;i++) {
		arr[i]=temp[i-s];
	}
	}
}
