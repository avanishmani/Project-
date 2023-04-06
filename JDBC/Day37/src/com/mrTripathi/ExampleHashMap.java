package com.mrTripathi;

import java.util.HashMap;

public class ExampleHashMap {
public static void main(String[] args) {
	
	// Create a HashMap
	HashMap<String, Integer> hashMap = new HashMap<>();
	
	// Add elements to the HashMap
	hashMap.put("John", 25);
	hashMap.put("Jane", 30);
	hashMap.put("Jim", 35);
	
	// Access elements in the HashMap
	System.out.println(hashMap.get("John")); // Output: 25
	
	// Remove an element from the HashMap
	hashMap.remove("Jim");
	
	// Check if an element is present in the HashMap
	System.out.println(hashMap.containsKey("Jim")); // Output: false
	
	// Get the size of the HashMap
	System.out.println(hashMap.size()); // Output: 2
}
}

