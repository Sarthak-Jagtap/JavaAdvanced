package HackerRankM1;

import java.util.Stack;

/**
 * Given a string containing brackets (), {}, and [], determine whether the
 * brackets are balanced. A string is considered balanced if all opening
 * brackets are properly closed in the correct order.
 */

public class Ques03 {
	public boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == ']' && top != '[') return false;
                if (ch == '}' && top != '{') return false;
            }
        }

        return stack.isEmpty();
    }

	
	public static int main(String[] args) {
		return 0;
	}
}
