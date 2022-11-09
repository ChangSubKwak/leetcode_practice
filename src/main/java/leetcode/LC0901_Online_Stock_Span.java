package leetcode;

import java.util.Stack;

public class LC0901_Online_Stock_Span {
    static class StockSpanner {
        private Stack<int[]> stack;

        public StockSpanner() {
            stack = new Stack<>();
        }

        public int next(int price) {
            int answer = 1;
            while (!stack.isEmpty() && stack.peek()[0] <= price) {
                answer += stack.pop()[1];
            }

            stack.push(new int[]{price, answer});
            return answer;
        }
    }
}
