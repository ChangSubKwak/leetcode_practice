package leetcode;

public class LC0560_Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        int[] sumArray = new int[nums.length];
        sumArray[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumArray[i] = sumArray[i - 1] +  nums[i];
        }
        
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start; end < nums.length; end++) {
                int sum = sumArray[end] - ((start - 1) < 0 ? 0 : sumArray[start - 1]);
                
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
