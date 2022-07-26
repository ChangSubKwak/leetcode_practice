package leetcode;

public class LC0034_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    private int[] result;

    private void binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return;
        }

        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            int index = mid;
            while(index >= 0 && nums[index] == target) {
                index--;
            }
            result[0] = index + 1;

            index = mid;
            while(index < nums.length && nums[index] == target) {
                index++;
            }
            result[1] = index - 1;
            return;
        } else if (nums[mid] > target) {
            binarySearch(nums, target, start, mid - 1);
        } else if (nums[mid] < target) {
            binarySearch(nums, target, mid + 1, end);
        }

    }

    public int[] searchRange(int[] nums, int target) {
        result = new int[]{-1, -1};
        binarySearch(nums, target, 0, nums.length - 1);
        return result;
    }
}
