package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LC0081_Search_in_Rotated_Sorted_Array_II {
    public boolean search2(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toList());
        
        return list.contains(target);
    }
	
	public boolean myBS(int[] array, int target, int left, int right) {
		if (left > right) return false;
		
		int mid = (left + right) / 2;
		if (mid >= array.length) return false;
		
		if (target == array[mid]) return true;
		else if (target > array[mid]) return myBS(array, target, mid+1, right);
		else                          return myBS(array, target, left, mid-1);
	}
	
    public boolean search1(int[] nums, int target) {
    	int len = nums.length;
    	if (len == 0) return false;
    	
    	int[] t = new int[len];
    	int start = -1;
    	for (int i = 0 ; i < len - 1 ; i++) {
    		if (nums[i] > nums[i+1]) {
    			start = i;
    			break;
    		}
    	}
    	
    	if (start != -1) {
    		System.arraycopy(nums, start+1, t, 0, len - start - 1);
    		System.arraycopy(nums, 0, t, len - start - 1, start + 1);
    	} else {
    		System.arraycopy(nums, 0, t, 0, len);
    	}
//    	System.out.println(Arrays.toString(t));
//    	System.out.println(Arrays.toString(t) + " : " + target + " --> " + Arrays.binarySearch(t, target));
//    	return Arrays.binarySearch(t, target) >= 0;
    	return myBS(t, target, 0, len);
    }
}
