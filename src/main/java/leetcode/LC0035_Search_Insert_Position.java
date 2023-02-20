package leetcode;

public class LC0035_Search_Insert_Position {
    private int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return start;
        }

        int mid = ( start + end ) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, end);
        }

        return binarySearch(nums, target, start, mid - 1);
    }

    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
}
