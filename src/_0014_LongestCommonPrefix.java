// Write a function to find the longest common prefix string amongst an array of
// strings.
//
// If there is no common prefix, return an empty string "".

public class _0014_LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		int len = strs.length;

		if (strs == null || len == 0)
			return "";

		int min = strs[0].length();

		for (int i = 1; i < len; i++)
			min = Math.min(min, strs[i].length());

		for (int i = 0; i < min; i++) {
			char current = strs[0].charAt(i);

			for (int j = 1; j < len; j++) {
				if (strs[j].charAt(i) != current)
					return strs[0].substring(0, i);
			}
		}

		return strs[0].substring(0, min);
	}

	public static void main(String[] args) {
		_0014_LongestCommonPrefix solution = new _0014_LongestCommonPrefix();

		// fl
		System.out.println(
				solution.longestCommonPrefix(
						new String[] { "flower", "flow", "flight" }));
		// <none>
		System.out.println(
				solution.longestCommonPrefix(
						new String[] { "dog", "racecar", "car" }));
	}
}
