package main.java.leetcode;

import java.util.Arrays;

public class LC0031_NextPermutation_X {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        
        if (i >= 0) {
        	int j = nums.length - 1;
        	while(j >= 0 && nums[j] <= nums[i]) j--;
        	swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }
    
    public void reverse(int[] nums, int start) {
    	int i = start, j = nums.length - 1;
    	while(i < j) {
    		swap(nums, i, j);
    		i++;
    		j--;
    	}
    }
    
    public void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
    
	public static void main(String[] args) {
		LC0031_NextPermutation_X t = new LC0031_NextPermutation_X();
		//int[] test = new int[] {1, 2, 3};
		int[] test = new int[] {1, 2, 3, 4};
		for (int i = 0 ; i < 2 ; i++) {
			t.nextPermutation(test);
			System.out.println(Arrays.toString(test));
		}
		System.exit(0);
		
		test = new int[] {3, 2, 1};
		t.nextPermutation(test);
		System.out.println(Arrays.toString(test));
		
		test = new int[] {1, 1, 5};
		t.nextPermutation(test);
		System.out.println(Arrays.toString(test));
		
		test = new int[] {1};
		t.nextPermutation(test);
		System.out.println(Arrays.toString(test));
	}
}
