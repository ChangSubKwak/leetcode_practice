package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LC0150_Evaluate_Reverse_Polish_Notation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<String> operator = Arrays.asList("+", "-", "*", "/");
        
        for (int i = 0; i < tokens.length; i++) {
            if (operator.contains(tokens[i])) {
                int op2 = stack.pop();
                int op1 = stack.pop();
                if ("+".equals(tokens[i])) {
                    stack.push(op1 + op2);
                    continue;
                }
                
                if ("-".equals(tokens[i])) {
                    stack.push(op1 - op2);
                    continue;
                }
                
                if ("*".equals(tokens[i])) {
                    stack.push(op1 * op2);
                    continue;
                }
                
                if ("/".equals(tokens[i])) {
                    stack.push(op1 / op2);
                    continue;
                }
            }
            stack.push(Integer.valueOf(tokens[i]));
        }
        
        return stack.pop();
    }
}
