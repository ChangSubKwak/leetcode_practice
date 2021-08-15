package leetcode;

import java.util.Set;
import java.util.TreeSet;

public class LC0128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
    	Set<Integer> set = new TreeSet<>();
    	for (int i = 0; i < nums.length; i++) {
    		set.add(nums[i]);
    	}
    	System.out.println(set);

    	int count = 0, maxCount = -1;
    	int prev = 1_000_000_001;
    	boolean isFirst = true;
    	for (Integer i : set) {
    		if (isFirst) {
    			prev = i;
                count = 1;
    			isFirst = false;
    			continue;
    		}
    		
    		if (i == prev + 1) {
    			prev = i;
    			count++;
    			continue;
    		}
    		
    		if (maxCount < count) {
    			maxCount = count;
    		}
    		count = 1;
    		prev = i;
    	}
    	
		if (maxCount < count) {
			maxCount = count;
		}
    	
        return maxCount;
    }
	
	public static void main(String[] args) {
		LC0128_LongestConsecutiveSequence t = new LC0128_LongestConsecutiveSequence();
		System.out.println(t.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
		System.out.println(t.longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1}));
	}
}
