package com.BinarySearch;

public class MidInRotatedArray {
	public static void main(String[] args) {
		int[] array = { 3, 4, 5,0, 1, 2 };
		System.out.println(send(array));
	}

	static int send(int[] nums) {
		int st = 0;
		int end = nums.length - 1;
		

		while (st < end) {
			int mid = st + (end - st) / 2;
			if (nums[mid] > nums[end] && nums[end] < nums[st]) {
				st = mid + 1;
			} else if (nums[mid] < nums[end] && nums[end] > nums[st]) {
				end = mid - 1;
			} else {
				end--;
			}
		}
		return nums[st];
	}
}
