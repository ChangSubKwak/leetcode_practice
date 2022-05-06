package leetcode;

import java.util.Stack;

public class LC1209_Remove_All_Adjacent_Duplicates_in_String_II_X {
    public String repeat(char input, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(String.valueOf(input));
        }
        return sb.toString();
    }
    
    public String removeDuplicates(String s, int k) {
        int length = s.length();
        if (length < k) {
            return s;
        }
        
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            if (stack.isEmpty() || stack.peek().charAt(0) != s.charAt(i))  {
                stack.push(s.charAt(i) + "" + 1);
            }
            else {
                String prev = stack.pop();
                stack.push(s.charAt(i) + "" + (Integer.valueOf(prev.substring(1)) + 1) );
            }
            
            if (stack.peek().substring(1).equals(k + "")) {
                stack.pop();
            }
        }
        
        System.out.println(stack);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            result.append(repeat(stack.get(i).charAt(0), Integer.valueOf(stack.get(i).substring(1))));
        }
        
        return result.toString();
    }
}
