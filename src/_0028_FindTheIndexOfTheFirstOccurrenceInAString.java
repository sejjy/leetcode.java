// Given two strings needle and haystack, return the index of the first
// occurrence of needle in haystack, or -1 if needle is not part of haystack.

public class _0028_FindTheIndexOfTheFirstOccurrenceInAString {

	public int strStr(String haystack, String needle) {
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			if (haystack.startsWith(needle, i))
				return i;
		}

		return -1;
	}

	public static void main(String[] args) {
		_0028_FindTheIndexOfTheFirstOccurrenceInAString solution =
			new _0028_FindTheIndexOfTheFirstOccurrenceInAString();

		System.out.println(solution.strStr("sadbutsad", "sad"));  // 0
		System.out.println(solution.strStr("leetcode", "leeto")); // -1
	}
}
