package leetcode;

import java.util.*;

public class LC0018_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> resList = new ArrayList<List<Integer>>();
    	
    	Arrays.sort(nums);
    	for (int i = 0 ; i < nums.length ; i++) {
    		for (int j = i + 1 ; j < nums.length ; j++) {
    			for (int k = j + 1 ; k < nums.length ; k++) {
    				for (int l = k + 1 ; l < nums.length ; l++) {
    					if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
    						List<Integer> res = new ArrayList<>();
    						res.add(nums[i]); res.add(nums[j]); res.add(nums[k]); res.add(nums[l]);
    						Collections.sort(res);
    						if (!resList.contains(res))
    							resList.add(res);
    					}
    				}
    			}
    		}
    	}
    	
    	return resList;
    }
	
	public static void main(String[] args) {
		LC0018_4Sum lc = new LC0018_4Sum();
		System.out.println(lc.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0));
	}
}
