package leetcode;

public class LC0001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        
        for (int i = 0 ; i < nums.length ; i++) {
            for (int j = i + 1 ; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                    break;
                }
            }
        }
        
        return ret;
    }

	public static void main(String[] args) {
//		int[] array = {2, 7, 11, 15};
//		System.out.println(new LC1_TwoSum().twoSum(new int[] {2, 7, 11, 15} , 9));
		for (int i : new LC0001_TwoSum().twoSum(new int[] {2, 7, 11, 15} , 9)) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
