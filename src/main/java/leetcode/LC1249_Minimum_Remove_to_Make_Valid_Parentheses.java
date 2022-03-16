package leetcode;

import java.util.Stack;

public class LC1249_Minimum_Remove_to_Make_Valid_Parentheses {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st1.add(s.charAt(i));
                st2.add(i);
                continue;
            }
            
            if (s.charAt(i) == ')') {
                if (st1.size() > 0 && st1.peek() == '(') {
                    st1.pop();
                    st2.pop();
                    continue;
                }
                st1.add(s.charAt(i));
                st2.add(i);
            }
        }
        
        StringBuilder sb = new StringBuilder(s);
        while(st2.size() > 0) {
            sb.setCharAt(st2.pop(), '_');
        }
        
        return sb.toString().replace("_", "");
    }
}
