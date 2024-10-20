package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class LC1106_Parsing_A_Boolean_Expression {
    public boolean parseBoolExpr(String expression) {
        int length = expression.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            char c = expression.charAt(i);
            if (c == ')') {
                ArrayList<Character> values = new ArrayList<>();
                while (stack.peek() != '(') {
                    values.add(stack.pop());
                }
                stack.pop();

                char operator = stack.pop();
                char result = evaluateSubExpr(operator, values);
                stack.push(result);
                continue;
            }

            if (c != ',') {
                stack.push(c);
            }
        }

        return stack.pop() == 't';
    }

    private char evaluateSubExpr(char operator, ArrayList<Character> values) {
        if (operator == '!') {
            return values.get(0) == 't' ? 'f' : 't';
        }

        if (operator == '&') {
            for (char value : values) {
                if (value == 'f') {
                    return 'f';
                }
            }
            return 't';
        }

        if (operator == '|') {
            for (char value : values) {
                if (value == 't') {
                    return 't';
                }
            }
            return 'f';
        }

        return 'f';
    }
}
