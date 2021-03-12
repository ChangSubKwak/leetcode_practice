package main.java.leetcode;

public class LC1664_WaystoMakeaFairArray {
    public int waysToMakeFair(int[] nums) {
    	int oddSum = 0;
    	int evnSum = 0;
    	int len = nums.length;
    	for (int i = 0 ; i < len ; i++) {
    		if (i % 2 == 0) evnSum += nums[i];
    		else if      (i % 2 == 1) oddSum += nums[i];
    	}
    	
    	int orgOddSum = 0;
    	int orgEvnSum = 0;
    	int count = 0;
    	for (int i = 0 ; i < len ; i++) {
    		if (i > 0 && (i-1) % 2 == 0) {
    			orgEvnSum += nums[i-1];
    		}
    		else if (i > 0 && (i-1) % 2 == 1) {
    			orgOddSum += nums[i-1];
    		}
    		
    		int totalOS = 0;
    		int totalES = 0;
    		
    		if (i % 2 == 0) {
    			totalES = orgEvnSum + oddSum;
    			totalOS = orgOddSum + evnSum - nums[i];
    			if (totalOS == totalES) count++;
    			evnSum -= nums[i]; 
    		} else {
    			totalES = orgEvnSum + oddSum - nums[i];
    			totalOS = orgOddSum + evnSum;
    			if (totalOS == totalES) count++;
    			oddSum -= nums[i];
    		}
    	}
    	
        return count;
    }
	

	public static void main(String[] args) {
		LC1664_WaystoMakeaFairArray t = new LC1664_WaystoMakeaFairArray();
//		System.out.println(t.waysToMakeFair(new int[] {6,1,7,4,1}));
		System.out.println(t.waysToMakeFair(new int[] {2,1,6,4}));
//		System.out.println(t.waysToMakeFair(new int[] {1,1,1}));
//		System.out.println(t.waysToMakeFair(new int[] {1,2,3}));
	}

}
