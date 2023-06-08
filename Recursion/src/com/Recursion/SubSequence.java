package com.Recursion;


import java.util.Scanner;
import java.util.Set;
import java.util.*;
public class SubSequence {




	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String for which you want subsequence!");
	        String st = sc.next();
	        Set<String> set = new TreeSet<>(); // Use TreeSet to maintain sorted order
	        send(set, st, 0, st.length(), "");
	        for (String s : set) {
	            System.out.println(s);
	        }
	    }

	    static void send(Set<String> set, String st, int i, int l, String ans) {
	        if (i == l) {
	            set.add(ans); // Add the current ans to the set of subsequences
	            return;
	        }
	        // Recursive call without appending the current character
	        send(set, st, i + 1, l, ans);

	        // Recursive call with appending the current character
	        send(set, st, i + 1, l, ans + st.charAt(i));
	    }
	}
