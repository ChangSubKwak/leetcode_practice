package leetcode;

public class LC1381_Design_a_Stack_With_Increment_Operation {
    static class CustomStack {
        private int[] stack;
        private int currentIndex;

        public CustomStack(int maxSize) {
            stack = new int[maxSize];
            currentIndex = 0;
        }

        public void push(int x) {
            if (currentIndex >= stack.length) {
                return;
            }
            stack[currentIndex] = x;
            currentIndex++;
        }

        public int pop() {
            if (currentIndex <= 0) {
                return -1;
            }

            currentIndex--;
            return stack[currentIndex];
        }

        public void increment(int k, int val) {
            k = Math.min(k, stack.length);
            for (int i = 0; i < k; i++) {
                stack[i] += val;
            }
        }
    }
}
