package com.mrTripathi;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    /* Driver Function to test other function */
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] testCase1 = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(testCase1)); // "fl"
        String[] testCase2 = {"dog", "racecar", "car"};
        System.out.println(lcp.longestCommonPrefix(testCase2)); // ""
    }
}