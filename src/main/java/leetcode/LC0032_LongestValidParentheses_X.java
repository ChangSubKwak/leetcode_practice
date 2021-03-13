package leetcode;

import java.util.Stack;

public class LC0032_LongestValidParentheses_X {
    public int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) stack.push(i);
                else               max = Math.max(max, i - stack.peek());
            }
        }
        return max;
    }
    
	public static void main(String[] args) {
		LC0032_LongestValidParentheses_X t = new LC0032_LongestValidParentheses_X();
		System.out.println(t.longestValidParentheses("(()"));
		System.out.println(t.longestValidParentheses(")()())"));
		System.out.println(t.longestValidParentheses(""));
	}
}
