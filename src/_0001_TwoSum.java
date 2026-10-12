// Given an array of integers nums and an integer target, return indices of the
// two numbers such that they add up to target.
//
// You may assume that each input would have exactly one solution, and you may
// not use the same element twice.
//
// You can return the answer in any order.
//
//
// Example 1:
//
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class _0001_TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] output = new int[2];
		int length = nums.length;

		for (int i = 0; i < length; i++)
			for (int j = i + 1; j <= length - 1; j++)
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
				}

		return output;
	}

	public static void main(String[] args) {
		_0001_TwoSum solution = new _0001_TwoSum();

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = solution.twoSum(nums, target);

		System.out.println("[" + result[0] + "," + result[1] + "]");
	}
}
