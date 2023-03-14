package com.Avanish.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("Avanish");
		li.add("Chandan");
		li.add("Devika");
		li.add("Radhikesh");
		li.add("Murlika");
		Collections.sort(li, new ReverseString());
		// System.out.println(li);
		List<Person> p = new ArrayList<>();
		p.add(new Person(1, "Avanish"));
		p.add(new Person(2, "Abishek"));
		p.add(new Person(3, "Kuldeep"));
		p.add(new Person(4, "Shivanand"));
		p.add(new Person(5, "Bhuwneshwar"));
		Collections.sort(p,new CompareClass());
		System.out.println(p);
	}

}
