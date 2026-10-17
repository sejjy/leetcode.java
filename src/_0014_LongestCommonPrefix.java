// Write a function to find the longest common prefix string amongst an array of
// strings.
//
// If there is no common prefix, return an empty string "".

public class _0014_LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		int length = strs.length;

		if (strs == null || length == 0) {
			return "";
		}

		int min = strs[0].length();
		int i;

		for (i = 1; i < length; i++) {
			min = Math.min(min, strs[i].length());
		}

		for (i = 0; i < min; i++) {
			char current = strs[0].charAt(i);

			for (int j = 1; j < length; j++) {
				if (strs[j].charAt(i) != current) {
					return strs[0].substring(0, i);
				}
			}
		}

		return strs[0].substring(0, min);
	}
}
