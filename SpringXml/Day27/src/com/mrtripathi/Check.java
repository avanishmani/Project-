package com.mrtripathi;

public class Check {
	

	
	    public static void main(String[] args) {
	        
	        int n = 3;
	        int[] ratings = {1,2,2};
	       
	      

	        int[] tablets = new int[n];
	        for (int i = 0; i < n; i++) {
	            tablets[i] = 1;
	        }

	        for (int i = 1; i < n; i++) {
	            if (ratings[i] > ratings[i-1]) {
	                tablets[i] = Math.max(tablets[i], tablets[i-1]+1);
	            }
	        }

	        for (int i = n-2; i >= 0; i--) {
	            if (ratings[i] > ratings[i+1]) {
	                tablets[i] = Math.max(tablets[i], tablets[i+1]+1);
	            }
	        }

	        int totalTablets = 0;
	        for (int i = 0; i < n; i++) {
	            totalTablets += tablets[i];
	        }

	        System.out.println(totalTablets);
	    }
	}
