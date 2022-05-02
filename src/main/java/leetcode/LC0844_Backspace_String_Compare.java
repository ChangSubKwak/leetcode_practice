package leetcode;

import java.util.Stack;

public class LC0844_Backspace_String_Compare {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String S) {
        Stack<Character> ans = new Stack<>();
        for (char c: S.toCharArray()) {
            if (c != '#') {
                ans.push(c);
                continue;
            }
            
            if (!ans.empty()) {
                ans.pop();
            }
        }
        
        return String.valueOf(ans);
    }	
}
