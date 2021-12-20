package leetcode;

import java.util.Stack;

public class LC0394_Decode_String {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        int i = 0;
        
        StringBuilder sb = new StringBuilder();
        while(i < s.length()) {
            char c = s.charAt(i);
            i++;
            
            if ('0' <= c && c <= '9') {
                StringBuilder number = new StringBuilder();
                while('0' <= c && c <= '9') {
                    number.append(c);
                    c = s.charAt(i);
                    i++;
                }
                stack.push(number.toString());
                stack.push(sb.toString());
                sb.setLength(0);
                continue;
            }
            
            if (c == ']') {
                StringBuilder prev = new StringBuilder(stack.pop());
                int number = Integer.valueOf(stack.pop());
                StringBuilder addString = new StringBuilder();
                for(int j = 0; j < number; j++) {
                    addString.append(sb.toString());
                }
                
                sb = new StringBuilder(prev.append(addString));
                continue;
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}
