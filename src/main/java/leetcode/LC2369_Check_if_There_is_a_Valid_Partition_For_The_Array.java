package leetcode;

public class LC2369_Check_if_There_is_a_Valid_Partition_For_The_Array {
    public boolean validPartition(int[] nums) {
        int length = nums.length;
        boolean[] two = new boolean[length];
        boolean[] three = new boolean[length];
        boolean[] isMove = new boolean[length + 1];
        int count = 0;
        
        for (int i = 1; i < length; i++) {
            if (nums[i - 1] == nums[i]) {
                two[i - 1] = true;
            }
        }
        
        for (int i = 2; i < length; i++) {
            if (nums[i - 2] == nums[i - 1] && nums[i - 1] == nums[i]) {
                three[i - 2] = true;
            }
            
            if ((nums[i - 2] + 1) == nums[i - 1] && (nums[i - 1] + 1) == nums[i]) {
                three[i - 2] = true;
            }
        }
        
        isMove[0] = true;
        for (int i = 0; i < length; i++) {
            if (isMove[i] && (i + 2 <= length && two[i])) {
                isMove[i + 2] = true;
            }
            
            if (isMove[i] && (i + 3 <= length && three[i])) {
                isMove[i + 3] = true;
            }
        }
        
        return isMove[length];
    }
}
