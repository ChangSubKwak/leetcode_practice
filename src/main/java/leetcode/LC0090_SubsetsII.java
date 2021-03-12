package main.java.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC0090_SubsetsII {
	public void exec(int[] nums, List<List<Integer>> result, List<Integer> curList, int n, int k, int start) {
		if (curList.size() == k) {
			List<Integer> t = new ArrayList<>(curList);
			Collections.sort(t);
			if (!result.contains(t))
				result.add(new ArrayList<Integer>(t));
			return ;
		}
		for (int i = start ; i <= n ; i++) {
			//curList.add(i);
			curList.add(nums[i-1]);
			exec(nums, result, curList, n, k, i+1);
			curList.remove(curList.size() - 1);
		}
	}
	
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
    	List<Integer> list = new ArrayList<>();
    	
    	result.add(new ArrayList<Integer>());
    	int len = nums.length;
    	for (int i = 1 ; i <= len ; i++)
    		exec(nums, result, list, len, i, 1);
    	
    	return result;
    }
	
	public static void main(String[] args) {
		LC0090_SubsetsII t = new LC0090_SubsetsII();
//		System.out.println(t.subsetsWithDup(new int[] {1,2,2}));
		System.out.println(t.subsetsWithDup(new int[] {4,1,0}));
	}
}
