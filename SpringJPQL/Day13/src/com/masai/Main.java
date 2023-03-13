package com.masai;

import java.util.HashMap;
import java.util.Map;

public class Main {
public static void main(String [] args) {
	Map<Integer, String> map=new HashMap<>();
	map.put(1, "One");
	map.put(2, "Two");
	map.put(3, "Three");
	map.put(4, "Four");
	map.put(5, "Five");
	send(map);
}
public static void send(Map<Integer, String> map) {
	for(Map.Entry<Integer, String> entry: map.entrySet()) {
		System.out.println(entry.getKey()+" : "+ entry.getValue());
	}
}
}
