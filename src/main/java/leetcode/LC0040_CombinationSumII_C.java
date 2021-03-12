package main.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0040_CombinationSumII_C {
//	public static List<List<Integer>> result = new ArrayList<>();
//	public void calc(int[] cand, int target, List<Integer> l, List<Integer> idx, int sum) {
//		for (int i = 0 ; i < cand.length ; i++) {
//			if (idx.contains(i)) continue;
//
//			l.add(cand[i]);
//			idx.add(i);
//			
//			if (sum + cand[i] == target) {
//				List<Integer> tl = new ArrayList<>(l);
//				Collections.sort(tl);
//				if (!result.contains(tl))
//					result.add(tl);
//			} else if (sum + cand[i] < target) {
//				calc(cand, target, l, idx, sum + cand[i]);
//			}
//			
//			l.remove(l.size() - 1);
//			idx.remove(idx.size() - 1);
//		}
//	}
//	
//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//    	List<Integer> l = new ArrayList<>();
//    	List<Integer> idx = new LinkedList<>();
//    	result.clear();
//		int candSum = IntStream.of(candidates).sum();
//		if (candSum >= target) calc(candidates, target, l, idx, 0);
//        return result;
//    }
	
	public List<List<Integer>> combinationSum2(int[] nums, int target) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, target, 0);
	    return list;
	    
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
	    if(remain < 0) return;
	    else if(remain == 0) list.add(new ArrayList<>(tempList));
	    else{
	        for(int i = start; i < nums.length; i++){
//	            if(i > start && nums[i] == nums[i-1])
//	            	continue; // skip duplicates
	            tempList.add(nums[i]);
	            backtrack(list, tempList, nums, remain - nums[i], i + 1);
	            tempList.remove(tempList.size() - 1); 
	        }
	    }
	} 
    
	public static void main(String[] args) {
		LC0040_CombinationSumII_C t = new LC0040_CombinationSumII_C();
//		List<List<Integer>> ll = t.combinationSum2(new int[] {10,1,2,7,6,1,5}, 8);
//		List<List<Integer>> ll = t.combinationSum2(new int[] {2,5,2,1,2}, 5);
		List<List<Integer>> ll = t.combinationSum2(new int[] {1,1,1,1,1
				,1,1,1,1,1
				,1,1,1,1,1
				,1,1,1,1,1
				,1,1,1,1,1},25);
		for (int i = 0 ; i < ll.size(); i++)
			System.out.println(ll.get(i));
	}
}
