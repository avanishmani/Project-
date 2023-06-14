package com.Greedy;

import java.util.Arrays;

public class MaximumSum {
	  static int sol(int arr[], int k)
	    {
	        // Sorting given array using in-built java sort
	        // function
	        Arrays.sort(arr);
	        int sum = 0;
	  
	        int i = 0;
	        while (k > 0) {
	            // If we find a 0 in our sorted array, we stop
	            if (arr[i] >= 0)
	                k = 0;
	            else {
	                arr[i] = (-1) * arr[i];
	                k = k - 1;
	            }
	            i++;
	        }
	  
	        // Calculating sum
	        for (int j = 0; j < arr.length; j++)
	            sum += arr[j];
	        return sum;
	    }
	  
	    // Driver Code
	    public static void main(String[] args)
	    {
	        int arr[] = { -2, 0, 5, -1, 2 };
	        System.out.println(sol(arr, 4));
	    }
}
