package com.mrTripathi;

import java.util.Arrays;

public class MyClassOne {
    public static int[] retainPositiveNumbers(int[] a) {
        if (a == null || a.length == 0) {
            return new int[0];
        }
        return Arrays.stream(a)
                .filter(x -> x > 0)
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(retainPositiveNumbers(new int[]{-100, 96, -33, 65, 45, -67, 99, 98, -91}))); // [45, 65, 96, 98, 99]
    }
}
