package com.Recursion;

import java.util.HashMap;

public class HashMapFrequency {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 3, 4, 3 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		System.out.println(map);
	}
}
