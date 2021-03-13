package leetcode;

public class LC0115_DistinctSubsequences_X {
    public int numDistinct(String s, String t) {
    	int[][] dp = new int[t.length() + 1][s.length() + 1];
    	for (int j = 0 ; j < s.length() + 1 ; j++)
    		dp[0][j] = 1;
    	
    	for (int i = 0 ; i < t.length() ; i++) {
    		for (int j = 0 ; j < s.length() ; j++) {
    			if (t.charAt(i) == s.charAt(j)) {
    				dp[i+1][j+1] = dp[i][j] + dp[i+1][j];
    			} else {
    				dp[i+1][j+1] = dp[i+1][j];
    			}
    		}
    	}
    	
//    	for (int i = 0 ; i <= t.length() ; i++)
//    		System.out.println(Arrays.toString(dp[i]));
    	
        return dp[t.length()][s.length()];
    }
	
	public static void main(String[] args) {
		LC0115_DistinctSubsequences_X t = new LC0115_DistinctSubsequences_X();
		System.out.println(t.numDistinct("babgbag", "bag"));
		System.out.println(t.numDistinct("rabbbit", "rabbit"));
	}
}
