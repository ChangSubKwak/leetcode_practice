package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0078_Subsets {
	public void exec(int[] nums, List<List<Integer>> result, List<Integer> curList, int n, int k, int start) {
		if (curList.size() == k) {
			result.add(new ArrayList<Integer>(curList));
			return ;
		}
		for (int i = start ; i <= n ; i++) {
			curList.add(nums[i-1]);
			exec(nums, result, curList, n, k, i+1);
			curList.remove(curList.size() - 1);
		}
	}
	
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
    	List<Integer> list = new ArrayList<>();
    	
    	for (int i = 0 ; i <= nums.length ; i++)
    		exec(nums, result, list, nums.length, i, 1);
        
    	return result;
    }
	
	public static void main(String[] args) {
		//System.out.println("ABC".contains("BC"));
		LC0078_Subsets t = new LC0078_Subsets();
		System.out.println(t.subsets(new int[] {1,2,3}));
	}
}
