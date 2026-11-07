// Given an array of integers nums and an integer target, return indices of the
// two numbers such that they add up to target.
//
// You may assume that each input would have exactly one solution, and you may
// not use the same element twice.
//
// You can return the answer in any order.

import java.util.Arrays;

public class _0001_TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int len = nums.length;
		int[] output = new int[2];

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
					return output;
				}
			}
		}

		return output;
	}

	public static void main(String[] args) {
		_0001_TwoSum solution = new _0001_TwoSum();

		// [0, 1]
		System.out.println(Arrays.toString(
			solution.twoSum(new int[] { 2, 7, 11, 15 }, 9)));
		// [1, 2]
		System.out.println(Arrays.toString(
			solution.twoSum(new int[] { 3, 2, 4 }, 6)));
		// [0, 1]
		System.out.println(Arrays.toString(
			solution.twoSum(new int[] { 3, 3 }, 6)));
	}
}
