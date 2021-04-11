package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0118_PascalsTriangle {
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
	
	public static void main(String[] args) {
		LC0118_PascalsTriangle t = new LC0118_PascalsTriangle();
		System.out.println(t.generate(5));
	}
}
