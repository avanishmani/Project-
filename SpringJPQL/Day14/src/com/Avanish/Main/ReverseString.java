package com.Avanish.Main;

import java.util.Comparator;

public class ReverseString implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		
		return -o1.compareTo(o2);
	}

	
}
