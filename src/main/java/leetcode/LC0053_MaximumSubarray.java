package leetcode;

public class LC0053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
    	int len = nums.length;
    	if (len == 1) return nums[0];
    	
    	int sum = 0, max = nums[0], i, j;
    	for (i = 0 ; i < len ; i++) {
    		sum = 0;
    		for (j = i ; j < len ; j++) {
    			sum += nums[j];
        		if (max < sum) {
//        			System.out.println(i + " : " + j);
        			max = sum;
        		}
    		}
    	}
    	
        return max;
    }
	
	public static void main(String[] args) {
		LC0053_MaximumSubarray t = new LC0053_MaximumSubarray();
		System.out.println(t.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		System.out.println(t.maxSubArray(new int[] {-2,-1}));
	}
}
