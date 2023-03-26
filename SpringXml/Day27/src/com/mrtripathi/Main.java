package com.mrtripathi;

public class Main {

	// Function to print array element
	public static void printArray(int arr[], int N)
	{
	     
	    // Traverse the array
	    for(int i = 0; i < N; i++)
	    {
	       System.out.print(arr[i] + " ");
	    }
	}
	     
	// Function to sort the array in O(N)
	public static void sortArray(int arr[], int N)
	{
	 
	    // Traverse the array
	    for(int i = 0; i < N;)
	    {
	 
	       // If the current element is
	       // at correct position
	       if (arr[i] == i + 1)
	       {
	           i++;
	       }
	        
	       // Else swap the current element
	       // with it's correct position
	       else
	       {
	           // Swap the value of
	           // arr[i] and arr[arr[i]-1]
	           int temp1 = arr[i];
	           int temp2 = arr[arr[i] - 1];
	           arr[i] = temp2;
	           arr[temp1 - 1] = temp1;
	       }
	    }
	}
	 
	// Driver Code   
	public static void main(String[] args)
	{
	    int arr[] = { 2, 1, 5, 3, 4 };
	    int N = arr.length;
	 
	    // Function call to sort the array
	    sortArray(arr, N);
	 
	    // Function call to print the array
	    printArray(arr, N);
	}
	}
