package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0047_PermutationsII {
	public void execute(int[] nums, List<List<Integer>> result, List<Integer> list, int[] check) {
		if (list.size() == nums.length && !result.contains(list)) {
			result.add(new ArrayList<>(list));
			return;
		}
		
		for (int i = 0 ; i < nums.length ; i++) {
			if (check[i] == 0) {
				list.add(nums[i]);
				check[i] = 1;
				execute(nums, result, list, check);
				check[i] = 0;
				list.remove(list.size() - 1);
			}
		}
	}
	
    public List<List<Integer>> permuteUnique(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
        execute(nums, result, new ArrayList<Integer>(), new int[nums.length]);
    	return result;
    }
	
	public static void main(String[] args) {
		LC0047_PermutationsII t = new LC0047_PermutationsII();
		int nums[] = {1, 2, 3};
		//int nums[] = {0, 1};
		//int nums[] = {1};
		List<List<Integer>> ll = t.permuteUnique(nums);
		for (int i = 0 ; i < ll.size() ; i++) {
			System.out.println(ll.get(i));
		}
	}
}
