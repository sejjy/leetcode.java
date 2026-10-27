// Given a string s consisting of words and spaces, return the length of the
// last word in the string.
//
// A word is a maximal substring consisting of non-space characters only.

public class _0058_LengthOfLastWord {

	public int lengthOfLastWord(String s) {
		int i = s.length() - 1;

		while (i > 0 && s.charAt(i) == ' ')
			i--;

		int len = 0;

		while (i >= 0 && s.charAt(i) != ' ') {
			len++;
			i--;
		}

		return len;
	}
}
