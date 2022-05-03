package leetcode;

public class LC0581_Shortest_Unsorted_Continuous_Subarray {
    public int findUnsortedSubarray(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int min = 10001, max = -10001;
        int start = 0, end = -1;        
        
        while (rightIndex >= 0) {
            if (nums[leftIndex] >= max) {
                max = nums[leftIndex];
            } else {
                end = leftIndex;
            }
            
            if (nums[rightIndex] <= min) {
                min = nums[rightIndex];   
            } else {
                start = rightIndex;
            }
            
            leftIndex++;
            rightIndex--;
        }
        
        return end - start + 1;
    }
}
