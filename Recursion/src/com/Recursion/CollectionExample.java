package com.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		System.out.println(list); // [apple, banana, cherry]

		HashSet<String> set = new HashSet<String>(list);
		System.out.println(set); // [banana, cherry, apple]

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s : set) {
			map.put(s, s.length());
		}
		System.out.println(map); // {banana=6, cherry=6, apple=5}

		ArrayList<Integer> values = new ArrayList<Integer>(map.values());
		Collections.sort(values);
		System.out.println(values); // [5, 6, 6]
	}
}
