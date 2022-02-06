package leetcode;

import java.util.Arrays;

public class LC0080_Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }
	
	/*
    public int removeDuplicates(int[] nums) {
    	int len = nums.length;
    	int p = 0;
    	
    	int c = 0;
    	int s = 0;
    	while(p < len) {
    		
    		c = 1;
    		while(p < len - 1 &&nums[p] == nums[p+1]) {
    			p++;
    			c++;
    		}
    		
    		c = Math.min(c, 2);
    		for (int i = s ; i < s + c ; i++)
    			nums[i] = nums[p];
    		s += c;
    		p++;
    	}
    	
    	System.out.println(Arrays.toString(nums));
    	
    	return s;
    }
    //*/
}
