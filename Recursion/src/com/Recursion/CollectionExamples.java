package com.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class CollectionExamples {
	public static void main(String[] args) {
	    ArrayList<String> arrayList = new ArrayList<String>();
	    arrayList.add("apple");
	    arrayList.add("banana");
	    arrayList.add("cherry");
	    System.out.println(arrayList); // [apple, banana, cherry]

	    LinkedList<String> linkedList = new LinkedList<String>(arrayList);
	    linkedList.addFirst("date");
	    System.out.println(linkedList); // [date, apple, banana, cherry]

	    HashSet<String> hashSet = new HashSet<String>(linkedList);
	    System.out.println(hashSet); // [banana, cherry, date, apple]

	    PriorityQueue<String> priorityQueue = new PriorityQueue<String>(hashSet);
	    System.out.println(priorityQueue.poll()); // apple
	    System.out.println(priorityQueue.poll()); // banana

	    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	    for (String s : hashSet) {
	      hashMap.put(s, s.length());
	    }
	    System.out.println(hashMap); // {banana=6, cherry=6, date=4, apple=5}

	    TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(hashMap);
	    System.out.println(treeMap); // {apple=5, banana=6, cherry=6, date=4}

	    ArrayList<Integer> values = new ArrayList<Integer>(treeMap.values());
	    Collections.sort(values);
	    System.out.println(values); // [4, 5, 6, 6]
	  }
}
