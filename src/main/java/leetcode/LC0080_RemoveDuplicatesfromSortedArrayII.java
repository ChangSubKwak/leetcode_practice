package leetcode;

import java.util.Arrays;

public class LC0080_RemoveDuplicatesfromSortedArrayII {
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
	
	public static void main(String[] args) {
		LC0080_RemoveDuplicatesfromSortedArrayII t = new LC0080_RemoveDuplicatesfromSortedArrayII();
		System.out.println(t.removeDuplicates(new int[]{1,1,1,2,2,3}));
		System.out.println(t.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
	}
}
