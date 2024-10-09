package leetcode;

import java.util.Stack;

public class LC0921_Minimum_Add_to_Make_Parentheses_Valid {
    public int minAddToMakeValid(String s) {
        int length = s.length();
        int matchCount = 0;
        int unmatchCount = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
                continue;
            }

            if (c == ')' && stack.size() > 0) {
                stack.pop();
                matchCount++;
                continue;
            }

            unmatchCount++;
        }

        return unmatchCount + stack.size();
    }
}
