// Given an integer x, return true if x is a palindrome, and false otherwise.

public class _0009_PalindromeNumber {

	public boolean isPalindrome(int x) {
		String s = Integer.toString(x);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		_0009_PalindromeNumber solution = new _0009_PalindromeNumber();

		System.out.println(solution.isPalindrome(121));  // true
		System.out.println(solution.isPalindrome(-121)); // false
		System.out.println(solution.isPalindrome(10));   // false
	}
}
