package leetcode;

// O(n^2)
public class LC0005_Longest_Palindromic_Substring {
	public String longestPalindrome(String s) {
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        
        int max = 0;
        String result = "";
        for (int end = 0; end < length; end++) {
            for (int start = 0; start <= end; start++) {
                boolean isMatch = s.charAt(start) == s.charAt(end);
                dp[start][end] = (end - start <= 1) ? isMatch : (isMatch && dp[start + 1][end - 1]);
                
                if (dp[start][end] && max < end - start + 1) {
                    max = end - start + 1;
                    result = s.substring(start, end + 1);
                }
            }
        }
        return result;
    }
}
