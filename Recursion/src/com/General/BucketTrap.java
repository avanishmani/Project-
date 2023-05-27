package com.General;

public class BucketTrap {

	public static void main(String[] args) {
		int[] height = { 6, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trap(height));

	}

	public static int trap(int[] height) {
		int l = 0, r = height.length - 1, sum = 0, lMax = 0, rMax = 0;
		while (l <= r) {
			lMax = Math.max(height[l], lMax);
			rMax = Math.max(height[r], rMax);

			if (lMax < rMax) {
				sum += lMax - height[l++];
			} else {
				sum += rMax - height[r--];
			}
		}
		return sum;
	}

}
