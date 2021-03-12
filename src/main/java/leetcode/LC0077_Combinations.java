package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0077_Combinations {
	public void exec(List<List<Integer>> result, List<Integer> curList, int n, int k, int start) {
		if (curList.size() == k) {
			result.add(new ArrayList<Integer>(curList));
			return ;
		}
		for (int i = start ; i <= n ; i++) {
			curList.add(i);
			exec(result, curList, n, k, i+1);
			curList.remove(curList.size() - 1);
		}
	}
	
    public List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> result = new ArrayList<>();
    	List<Integer> list = new ArrayList<>();
    	exec(result, list, n, k, 1);
        
    	return result;
    }
	
	public static void main(String[] args) {
		//System.out.println("ABC".contains("BC"));
		LC0077_Combinations t = new LC0077_Combinations();
		System.out.println(t.combine(4, 2));
	}
}
