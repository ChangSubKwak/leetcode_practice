package main.java.leetcode;

import java.util.Arrays;

public class LC0239_SlidingWindowMaximum {
	//*
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int max = 0;
        int[] sw = new int[len - k + 1];
        
        int maxIdx = 0;
        for (int i = 0 ; i < k ; i++)
            if (max < nums[i]) {
                max = nums[i];
                maxIdx = i;
            }
        sw[0] = max;
        
        int idx = 1;
        for (int i = 1 ; i < len - k + 1 ; i++) {
            if (maxIdx == i - 1) {
                max = nums[i];
                maxIdx = i;
                for (int j = 0 ; j < k ; j++) {
                    if (max < nums[i + j]) {
                        max = nums[i + j];
                        maxIdx = i + j;
                    }
                }
            } else if (max < nums[i + k - 1]) {
                max = nums[i + k - 1];
                maxIdx = i + k - 1;
            }
                        
            sw[idx++] = max;
        }
        
        return sw;
    }
    //*/
	
	/*
	public int[] maxSlidingWindow(int[] a, int k) {		
		if (a == null || k <= 0) {
			return new int[0];
		}
		int n = a.length;
		int[] r = new int[n-k+1];
		int ri = 0;
		
		// store index
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < a.length; i++) {
			// remove numbers out of range k
			while (!q.isEmpty() && q.peek() < i - k + 1) {
				q.poll();
			}
			// remove smaller numbers in k range as they are useless
			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
				q.pollLast();
			}
			// q contains index... r contains content
			q.offer(i);
			if (i >= k - 1) {
				r[ri++] = a[q.peek()];
			}
		}
		return r;
	}
	//*/

	public static void main(String[] args) {
		LC0239_SlidingWindowMaximum t = new LC0239_SlidingWindowMaximum();
//		System.out.println(
//				Arrays.toString(t.maxSlidingWindow(new int[] {9,10,9,-7,-4,-8,2,-6}, 5))
//				);
		System.out.println(Arrays.toString(t.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3)));
	}

}
