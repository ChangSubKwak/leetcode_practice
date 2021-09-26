package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0131_PalindromePartitioning {
    public List<List<String>> partition(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        List<List<String>> result = new ArrayList<>();
        dfs(result, s, 0, new ArrayList<>(), dp);
        return result;
    }
    
    void dfs(List<List<String>> result, String s, int start, List<String> currentList, boolean[][] dp) {
    	if (start >= s.length()) {
    		result.add(new ArrayList<>(currentList));
    	}
    }
	
	public static void main(String[] args) {
		LC0131_PalindromePartitioning t = new LC0131_PalindromePartitioning();
		System.out.println(t.partition("aab"));
	}
}
