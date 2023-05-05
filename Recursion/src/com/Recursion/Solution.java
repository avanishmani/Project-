package com.Recursion;

import java.util.Arrays;

class Solution {
    public static int fib(int n) {
         // Create a dynamic programming array to store computed Fibonacci numbers
        int dp[] = new int[n+1];
        // Fill the array with a placeholder value
        Arrays.fill(dp, -1);
        // Call the helper method to calculate the nth Fibonacci number
        return helper(n, dp);
    }

    public static int helper(int n, int dp[]){
        // Base case: return the first or second Fibonacci number
        if(n <= 1){
            return n;
        }
        // If the nth Fibonacci number has already been computed, return it
        if(dp[n] != -1){
            return dp[n];
        }
        // Compute the nth Fibonacci number recursively
        dp[n] = helper(n-1,dp) + helper(n-2,dp);
        return dp[n];
    }
  public static void main(String[] args) {
	System.out.println(fib(5));
}
    }
