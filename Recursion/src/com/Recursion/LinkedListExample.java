package com.Recursion;

import java.util.LinkedList;

public class LinkedListExample {
	 public static void main(String[] args) {
		    int[] arr = {1, 1, 2, 3, 3, 3, 4,4,4,4,2};
		    LinkedList<Integer> linkedList = new LinkedList<Integer>();

		    int count = 1;
		    for (int i = 1; i < arr.length; i++) {
		      if (arr[i] == arr[i - 1]) {
		        count++;
		      } else {
		        linkedList.add(count);
		        count = 1;
		      }
		    }
		    linkedList.add(count);

		    System.out.println(linkedList);
		  }
}
