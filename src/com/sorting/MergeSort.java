package com.sorting;

public class MergeSort {

	public static int[] sort(int[] nums) {

		return divide(nums, 0, nums.length - 1);
	}

	static int[] divide(int[] nums, int l, int h) {
		if (l == h) {
			return new int[] { nums[l] };
		}
		int mid = (l + h) / 2;

		int[] left = divide(nums, l, mid);
		int[] right = divide(nums, mid + 1, h);

		return merge(left, right);

	}

	static int[] merge(int[] left, int[] right) {
		int length = left.length + right.length;

		int[] resultArr = new int[length];
		int leftIndex = 0;
		int rightIndex = 0;
		for (int index = 0; index < length; index++) {
			if (leftIndex == left.length || rightIndex == right.length) {
				if (leftIndex == left.length) {
					resultArr[index] = right[rightIndex];
					rightIndex++;
				} else {
					resultArr[index] = left[leftIndex];
					leftIndex++;
				}
			} else if (left[leftIndex] > right[rightIndex]) {
				resultArr[index] = right[rightIndex];
				rightIndex++;
			} else {
				resultArr[index] = left[leftIndex];
				leftIndex++;
			}
		}
		return resultArr;
	}
}
