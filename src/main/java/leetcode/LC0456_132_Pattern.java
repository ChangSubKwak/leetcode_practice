package leetcode;

import java.util.Stack;

public class LC0456_132_Pattern {
    public boolean find132pattern(int[] nums) {
        int length = nums.length;
        int[] min = new int[length];
        
        min[0] = nums[0];
        for (int i = 1; i < length; i++) {
            min[i] = Math.min(min[i - 1], nums[i]);
        }
        
        Stack<Integer> rightCandidate = new Stack<>();
        for (int i = length - 1; i >= 0; i--) {
            while (!rightCandidate.empty() && min[i] >= rightCandidate.peek()) {
                rightCandidate.pop();
            }
            
            if (!rightCandidate.empty() && min[i] < nums[i] && nums[i] > rightCandidate.peek()) {
                return true;
            }
            
            rightCandidate.push(nums[i]);
        }
        
        return false;
    }
}
