package leetcode;

import java.util.*;

public class LC0907_Sum_of_Subarray_Minimums {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] dp = new int[arr.length + 1];
        stack.push(-1);

        int result = 0;
        int mod = (int)1000_000_007;

        for (int i = 0; i < arr.length; i++) {
            while (stack.peek() != -1 && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            dp[i + 1] = (dp[stack.peek() + 1] + (i - stack.peek()) * arr[i]) % mod;
            stack.push(i);
            result += dp[i + 1];
            result %= mod;
        }
        return result;
    }
}
