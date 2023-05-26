package com.General;

import java.util.Stack;

public class StringCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
	}

	public static  int calculate(String s) {
		Stack<Integer> st = new Stack<>(); // to handle parenthesis
		int n = s.length();
		int sum = 0;
		int sign = 1; // if we have to do addition of negative number
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				int val = 0;
				while (i < n && Character.isDigit(s.charAt(i))) { // if digit length>1
					val = val * 10 + (s.charAt(i) - '0');
					i++;
				}
				i--; // to move i pointer to previous position
						// or you can use new pointer then we dont have to do it
				val = val * sign;
				sign = 1;
				sum += val;
			} else if (ch == '(') { // parenthesis handle
				st.push(sum);
				st.push(sign);
				sum = 0;
				sign = 1;
			} else if (ch == ')') {
				sum *= st.pop();
				sum += st.pop();
			} else if (ch == '-') {
				sign *= -1;
			}
		}
		return sum;
	}

}
