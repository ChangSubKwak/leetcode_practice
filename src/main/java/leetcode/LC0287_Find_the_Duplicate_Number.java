package leetcode;

public class LC0287_Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        int[] count = new int[100000 + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        
        int res = 0;
        for (int i = 1; i <= 100000; i++) {
            if (count[i] >= 2) {
                res = i;
                break;
            }
        }
        
        return res;
    }
}
