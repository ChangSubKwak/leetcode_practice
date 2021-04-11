package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0119_PascalsTriangleII {
	public static List<Integer> list;
	
	public void recur(List<Integer> curr, int depth, int numRows) {
		if (depth == numRows + 2) {
			list = new ArrayList<>(curr);
			return;
		}
		
		List<Integer> l = new ArrayList<>();
		if (depth == 1) {
			l.add(1);
		} else if (depth == 2) {
			l.add(1);	l.add(1);
		} else {
			l.add(1);
			for (int i = 0 ; i < depth - 2 ; i++)
				l.add(curr.get(i) + curr.get(i+1) );
			l.add(1);
			
		}
		curr = l;
		recur(curr, depth + 1, numRows);
	}
	
    public List<Integer> getRow(int rowIndex) {
        recur(null, 1, rowIndex);
        return list;
    }
	
	public static void main(String[] args) {
		LC0119_PascalsTriangleII t = new LC0119_PascalsTriangleII();
		System.out.println(t.getRow(3));
	}
}
