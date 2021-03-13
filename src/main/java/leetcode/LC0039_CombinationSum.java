package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC0039_CombinationSum {
	public static List<List<Integer>> result = new ArrayList<>();
	public void calc(int[] cand, int target, List<Integer> l) {
		int sum = l.stream().reduce(0, (a, b) -> a + b);
		for (int i = 0 ; i < cand.length ; i++) {
			l.add(cand[i]);
			if (sum + cand[i] == target) {
				List<Integer> tl = new ArrayList<>(l);
				Collections.sort(tl);
				if (!result.contains(tl))
					result.add(tl);
			} else if (sum + cand[i] < target) {
				calc(cand, target, l);
			}
			l.remove(l.size() - 1);
		}
	}
	
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<Integer> l = new ArrayList<>();
    	result.clear();
    	calc(candidates, target, l);
        return result;
    }
    
	public static void main(String[] args) {
		LC0039_CombinationSum t = new LC0039_CombinationSum();
//		List<List<Integer>> ll = t.combinationSum(new int[] {2,3,6,7}, 7);
//		List<List<Integer>> ll = t.combinationSum(new int[] {2,3,5}, 8);
//		List<List<Integer>> ll = t.combinationSum(new int[] {2}, 1);
		List<List<Integer>> ll = t.combinationSum(new int[] {1}, 1);
		for (int i = 0 ; i < ll.size(); i++)
			System.out.println(ll.get(i));
	}
}
