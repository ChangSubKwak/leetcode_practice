package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0047_Permutations_II {
	
	// Solution #2
    List<List<Integer>> list;
    boolean[] visit;
    
    public void recursive(List<Integer> t, int[] nums) {
        if (t.size() == nums.length) {
            if (!list.contains(t)) {
                list.add(new ArrayList<>(t));
            }
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visit[i]) {
                continue;
            }
            
            t.add(nums[i]);
            visit[i] = true;
            recursive(t, nums);
            t.remove(t.size() - 1);
            visit[i] = false;
        }
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        list = new ArrayList<>();
        visit = new boolean[nums.length];
        recursive(new ArrayList<>(), nums);
        return list;
    }
	
	// Solution #1
	/*
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
    //*/
}
