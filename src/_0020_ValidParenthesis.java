// Given a string s containing just the characters '(', ')', '{', '}', '[' and
// ']', determine if the input string is valid.
//
// An input string is valid if:
//
// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.
// 3. Every close bracket has a corresponding open bracket of the same type.

import java.util.Map;
import java.util.Stack;

class _0020_ValidParenthesis {

	public boolean isValid(String s) {
		Map<Character, Character> brackets = Map.of(
				')', '(',
				'}', '{',
				']', '[');
		Stack<Character> stack = new Stack<>();
		char ch;
		int i;

		for (i = 0; i < s.length(); i++) {
			ch = s.charAt(i);

			if (brackets.containsValue(ch)) {
				stack.push(ch);
			} else {
				if (stack.isEmpty() || stack.pop() != brackets.get(ch)) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
}
