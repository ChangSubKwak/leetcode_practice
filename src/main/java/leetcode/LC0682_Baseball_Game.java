package leetcode;

import java.util.Stack;

public class LC0682_Baseball_Game {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].matches("-?[0-9]+")) {
                stack.push(Integer.valueOf(ops[i]));
                continue;
            }
            
            if ("C".equals(ops[i])) {
                stack.pop();
                continue;
            }
            
            if ("D".equals(ops[i])) {
                stack.push(stack.peek() * 2);
                continue;
            }
            
            if ("+".equals(ops[i])) {
                int first  = stack.pop();
                int second = stack.peek();
                stack.push(first);
                stack.push(first + second);
            }
        }
        
        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        
        return sum;
    }	
}
