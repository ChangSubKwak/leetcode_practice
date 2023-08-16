package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC0239_Sliding_Window_Maximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }

        int length = nums.length;
        int[] result = new int[length - k + 1];
        Deque<Integer> indexDeque = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            while (!indexDeque.isEmpty() && nums[i] >= nums[indexDeque.peekLast()]) {
                indexDeque.pollLast();
            }
            indexDeque.offerLast(i);
        }
        result[0] = nums[indexDeque.peekFirst()];

        for (int i = k; i < nums.length; i++) {
            if (!indexDeque.isEmpty() && indexDeque.peekFirst() == i - k) {
                indexDeque.pollFirst();
            }

            while (!indexDeque.isEmpty() && nums[i] >= nums[indexDeque.peekLast()]) {
                indexDeque.pollLast();
            }

            indexDeque.offerLast(i);
            result[i - k + 1] = nums[indexDeque.peekFirst()];
        }
        return result;
    }
}
