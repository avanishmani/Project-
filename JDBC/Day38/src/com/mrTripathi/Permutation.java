package com.mrTripathi;

import java.util.HashSet;
import java.util.Set;

public class Permutation {
    public static Set<String> getPermutation(String str) {
        Set<String> result = new HashSet<>();
        if (str == null || str.length() == 0) {
            return result;
        }
        permute(str.toCharArray(), 0, result);
        return result;
    }

    private static void permute(char[] chars, int start, Set<String> result) {
        if (start == chars.length - 1) {
            result.add(new String(chars));
            return;
        }
        for (int i = start; i < chars.length; i++) {
            swap(chars, start, i);
            permute(chars, start + 1, result);
            swap(chars, start, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(getPermutation("123")); // [123, 132, 213, 231, 312, 321]
    }
}
