package leetcode;

import java.util.Arrays;

public class LC0189_RotateArray {
    public void rotate(int[] nums, int k) {
    	int index = 0;
    	int extra = nums[index];
    	
        for (int i = 0; i < nums.length; i++) {
        	index = (index + k) % nums.length;
        	int temp = nums[index];
        	nums[index] = extra;
        	extra = temp;
        }
    }
    
	public static void main(String[] args) {
		LC0189_RotateArray t = new LC0189_RotateArray();
		
		int[] input = new int[] {-1,-100,3, 99};
		t.rotate(input, 2);
		System.out.println(Arrays.toString(input));
	}
}
