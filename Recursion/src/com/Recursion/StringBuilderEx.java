package com.Recursion;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(" ");
		sb.append("world!");
		System.out.println(sb.toString()); // Output: "Hello world!"

		sb.insert(6, "beautiful ");
		System.out.println(sb.toString()); // Output: "Hello beautiful world!"

		sb.reverse();
		System.out.println(sb.toString()); // Output: "!dlrow lufituaeb olleH"

		StringBuilder str = new StringBuilder("AAAABBBCCCC");

		// print string
		System.out.println("String = " + str.toString());

		StringBuilder reverseStr = str.reverse();

		// print string
		System.out.println("Reverse String = " + reverseStr.toString());

		// Append ', '(44) to the String
		str.appendCodePoint(44);

		// Print the modified String
		System.out.println("Modified StringBuilder = " + str);

		// get capacity
		int capacity = str.capacity();

		// print the result
		System.out.println("StringBuilder = " + str);
		System.out.println("Capacity of StringBuilder = " + capacity);
	}
}
