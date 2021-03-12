package main.java.leetcode;

import java.util.Arrays;

public class LC0034_FindFirstandLastPositionofElementinSortedArray {
	public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int l = 0, h = len;
        int[] res = new int[2];
        
        if (len == 0) return new int[] {-1, -1};
        
        int m = ( l + h ) / 2;
        boolean isFound = false;
        while (l <= h && m >= 0 && m < len) {
        	if (nums[m] == target) {
        		isFound = true;
        		break;
        	}
        	if (nums[m] < target) l = m + 1;
        	else                  h = m - 1;

        	m = ( l + h ) / 2;
        }
        
        if (!isFound) return new int[] {-1, -1}; 
        
        int t = m;
        int first;
       	while (t >= 0 && nums[t] == target)
       		t--;
       	if (t < 0) first = 0;
       	else       first = t + 1;

       	t = m;
        int last;
       	while (t < len && nums[t] == target)
       		t++;
       	if (t >= len) last = len - 1;
       	else          last = t - 1;
       	
        res[0] = first;
        res[1] = last;
		
		return res;
	}
    
	public static void main(String[] args) {
		LC0034_FindFirstandLastPositionofElementinSortedArray t = new LC0034_FindFirstandLastPositionofElementinSortedArray();
		System.out.println(Arrays.toString(t.searchRange(new int[] {2, 2}, 3)));
//		System.out.println(Arrays.toString(t.searchRange(new int[] {5,7,7,8,8,10}, 8)));
//		System.out.println(Arrays.toString(t.searchRange(new int[] {5,7,7,8,8,10}, 6)));
//		System.out.println(Arrays.toString(t.searchRange(new int[] {}, 0)));
//		System.out.println(Arrays.toString(t.searchRange(new int[] {1}, 1)));
//		System.out.println(Arrays.toString(t.searchRange(new int[] {2, 2}, 2)));
//		System.out.println(Arrays.toString(t.searchRange(new int[] {1, 3}, 1)));
	}
}
