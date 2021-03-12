package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0022_GenerateParentheses {
	
	public void recursive(int depth, int n, List<String> res, String s) {
		if (depth == 0 && s.length() == n *2) {
			int state = 0;
			for (int i = 0 ; i < s.length() ; i++) {
				if (s.charAt(i) == '(') state++;
				else					state--;
				if (state < 0)
					return;
			}
			res.add(s);
			return;
		}
		
		if (s.length() >= n*2 || depth > n)
			return;
		
		recursive(depth + 1, n, res, s + "(");
		recursive(depth - 1, n, res, s + ")");
	}
	
	
    public List<String> generateParenthesis(int n) {
    	List<String> res = new ArrayList<>();
    	recursive(1, n, res, "(");
		return res;
    }
	
	public static void main(String[] args) {
		LC0022_GenerateParentheses t = new LC0022_GenerateParentheses();
		
		System.out.println(t.generateParenthesis(3));
	}
}
