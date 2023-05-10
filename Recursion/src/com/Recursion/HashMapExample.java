package com.Recursion;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
	    HashMap<String, Integer> map = new HashMap<String, Integer>();
	    map.put("Alice", 25);
	    map.put("Bob", 30);
	    map.put("Charlie", 35);

	    System.out.println(map.get("Alice")); // 25
	    System.out.println(map.containsKey("Bob")); // true
	    System.out.println(map.containsValue(35)); // true
	    System.out.println(map);
	  }
}
