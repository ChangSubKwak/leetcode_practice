package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LC0128_Longest_Consecutive_Sequence {
	public int longestConsecutive(int[] nums) {
		Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i: set) {
			pq.add(i);
		}
		
		if (pq.size() <= 1) {
			return pq.size();
		}
		
		int max = 0;
		int count = 1;
		int prevNum = pq.poll();
		while(pq.size() > 0) {
			int currNum = pq.poll();
			if ((prevNum + 1) == currNum) {
				count++;
			} else {
				count = 1;
			}
			
			if (max < count) {
				max = count;
			}
			
			prevNum = currNum;
		}
		return max;
	}
	
    public int longestConsecutive1(int[] nums) {
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
}
