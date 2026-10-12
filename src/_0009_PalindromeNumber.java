// Given an integer x, return true if x is a palindrome, and false otherwise.
//
//
// Example 1:
//
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

public class _0009_PalindromeNumber {

	public boolean isPalindrome(int x) {
		String s = Integer.toString(x);

		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		return true;
	}

	public static void main(String[] args) {
		_0009_PalindromeNumber solution = new _0009_PalindromeNumber();

		int x = 121;
		boolean result = solution.isPalindrome(x);

		System.out.println(result);
	}
}
