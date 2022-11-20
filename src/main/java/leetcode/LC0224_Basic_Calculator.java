package leetcode;

import java.util.*;

public class LC0224_Basic_Calculator {
    public int calculate(String s) {
        int len = s.length();
        int sign = 1;
        int result = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                int sum = s.charAt(i) - '0';
                while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
                    sum = sum * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }
                result += sum * sign;
                continue;
            }

            if (s.charAt(i) == '+') {
                sign = 1;
                continue;
            }

            if (s.charAt(i) == '-') {
                sign = -1;
                continue;
            }

            if (s.charAt(i) == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
                continue;
            }

            if (s.charAt(i) == ')') {
                result = result * stack.pop() + stack.pop();
                continue;
            }
        }
        return result;
    }
}
