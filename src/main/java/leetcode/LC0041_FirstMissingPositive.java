package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC0041_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
    	int len = nums.length;
    	Set<Integer> set = new HashSet<>();
    	
    	int i = 0 ;
    	for (i = 0 ; i < len ; i++) {
    		if (nums[i] <= 0 ) continue;
    		set.add(nums[i]);
    	}
    	
    	i = 1;
    	while(set.contains(i++));
        return i-1;
    }

	public static void main(String[] args) {
		LC0041_FirstMissingPositive t = new LC0041_FirstMissingPositive();
		System.out.println(t.firstMissingPositive(new int[] {1, 2, 0}));
		System.out.println(t.firstMissingPositive(new int[] {3, 4, -1, 1}));
		System.out.println(t.firstMissingPositive(new int[] {7, 8, 9, 11, 12}));
	}
}
