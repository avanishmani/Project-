package com.Recursion;

import java.util.*;

public class SmallerstAnagram {
    public static String findSmallestAnagram(String str) {
        // Convert the string to character array
        char[] charArray = str.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert the sorted character array back to string
        String sortedStr = new String(charArray);

        return sortedStr;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the String in which you want to find smallest anaram!");
        String str = sc.next();

        // Find the smallest anagram
        String smallestAnagram = findSmallestAnagram(str);

        System.out.println("Smallest Anagram: " + smallestAnagram);
    }
}
