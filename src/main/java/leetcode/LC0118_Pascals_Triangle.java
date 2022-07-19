package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0118_Pascals_Triangle {
	public List<List<Integer>> recursive(int depth, int numRows, List<List<Integer>> result) {
		if (depth == numRows) {
			return result;
		}
		
		List<Integer> subList = new ArrayList<>();
		int tobeSize = result.size() + 1;
		
		if (tobeSize <= 2) {
			for (int i = 0; i < tobeSize; i++) {
				subList.add(1);
			}
		} else {
			List<Integer> previousList = result.get(result.size() - 1);
			subList.add(1);
			for (int i = 1; i < tobeSize - 1; i++) {
				subList.add(previousList.get(i - 1) + previousList.get(i));
			}
			subList.add(1);
		}
		result.add(subList);
		
		return recursive(depth + 1, numRows, result);
	}
	
	public List<List<Integer>> generate(int numRows) {
		return recursive(0, numRows, new ArrayList<>());
	}
	
	/*
	public void recur(List<List<Integer>> list, int depth, int numRows) {
		if (depth == numRows + 1) return;
		
		List<Integer> l = new ArrayList<>();
		if (depth == 1) {
			l.add(1);
		} else if (depth == 2) {
			l.add(1);	l.add(1);
		} else {
			l.add(1);
			for (int i = 0 ; i < depth - 2 ; i++)
				l.add(list.get(depth - 2).get(i) + list.get(depth - 2).get(i+1) );
			l.add(1);
			
		}
		System.out.println(list);
		list.add(l);
		recur(list, depth + 1, numRows);
	}
	
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> list = new ArrayList<>();
    	
    	recur(list, 1, numRows);
        return list;
    }
    
	*/
}
