// Given an integer x, return true if x is a palindrome, and false otherwise.

public class _0009_PalindromeNumber {

	public boolean isPalindrome(int x) {
		String s = Integer.toString(x);
		int i;

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}

		return true;
	}
}
