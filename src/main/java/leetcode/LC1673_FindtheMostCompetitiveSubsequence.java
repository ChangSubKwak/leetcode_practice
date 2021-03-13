package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class LC1673_FindtheMostCompetitiveSubsequence {
	public int[] mostCompetitive(int[] nums, int k) {
	    Stack<Integer> stack = new Stack<>();
	    int[] result = new int[k];
	    for (int i = 0; i < nums.length; i++) {
	        while (!stack.empty() && nums[i] < nums[stack.peek()] && nums.length - i + stack.size() > k) {
	            stack.pop();
	        }
	        if (stack.size() < k) {
	            stack.push(i);
	        }
	        
//	        List<Integer> list = new ArrayList<>();
//	        for (int j = 0 ; j < stack.size() ; j++)
//	        	list.add(nums[stack.get(j)]);
//	        System.out.println(list);
	    }
	    for (int i = k - 1; i >= 0; i--) {
	        result[i] = nums[stack.pop()];
	    }
	    return result;	
    }
	

	public static void main(String[] args) {
		LC1673_FindtheMostCompetitiveSubsequence t = new LC1673_FindtheMostCompetitiveSubsequence();
//		System.out.println(Arrays.toString(t.mostCompetitive(new int[] {3,5,2,6}, 2)));
		System.out.println(Arrays.toString(t.mostCompetitive(new int[] {71,18,52,29,55,73,24,42,66,8,80,2}, 3)));
	}

}
