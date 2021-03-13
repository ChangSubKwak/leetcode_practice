package leetcode;

public class LC0072_EditDistance_X {
    public int minDistance(String word1, String word2) {
    	int l1 = word1.length();
    	int l2 = word2.length();
    	int[][] dp = new int[l1+1][l2+1];
    	for (int i = 1 ; i <= l1 ;i++) dp[i][0] = i;
    	for (int i = 1 ; i <= l2 ;i++) dp[0][i] = i;
    	
    	for (int i = 1 ; i <= l1 ; i++) {
    		for (int j = 1 ; j <= l2 ; j++) {
    			if (word1.charAt(i-1) == word2.charAt(j-1)) {
    				dp[i][j] = dp[i-1][j-1];
    			}
    			else {
    				dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j] )) + 1;
    			}
    		}
    	}
    	
        return dp[l1][l2];
    }
    
	public static void main(String[] args) {
		LC0072_EditDistance_X t = new LC0072_EditDistance_X();
		System.out.println(t.minDistance("sea", "eat"));
		System.out.println(t.minDistance("horse", "ros"));
		System.out.println(t.minDistance("intention", "execution"));
	}
}
