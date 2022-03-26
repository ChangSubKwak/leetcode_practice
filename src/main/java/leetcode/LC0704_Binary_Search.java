package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LC0704_Binary_Search {
    private int binarySearch(int[] nums, int target, int start, int end) {
        int mid = (start + end) / 2;
        
        if (target < nums[mid]) {
            return binarySearch(nums, target, start, mid - 1);
        }
        
        if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, end);
        }
        
        return mid;
    }
    
    public int search(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toList());

        if (!list.contains(target)) {
            return -1;
        }
        
        return binarySearch(nums, target, 0, nums.length - 1);
    }
}
