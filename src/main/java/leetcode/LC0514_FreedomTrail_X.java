package leetcode;

import java.util.Arrays;

public class LC0514_FreedomTrail_X {
    
    public int findRotateSteps(String ring, String key) {
    	int rs = ring.length();
    	int ks = key.length();
    	
    	int[][] dp = new int [ks+1][rs];
    	
//    	for (int i = 1 ; i <= ks ; i++) {
    	for (int i = ks - 1 ; i >= 0 ; i--) {
    		for (int j = 0 ; j < rs ; j++) {
    			dp[i][j] = Integer.MAX_VALUE;
    			for (int k = 0 ; k < rs ; k++) {
//    				if (ring.charAt(k) == key.charAt(i-1)) {
       				if (ring.charAt(k) == key.charAt(i)) {    					
	    				int diff = Math.abs(j - k);
	    				int step = Math.min(diff, rs - diff);
//	    				dp[i][j] = Math.min(dp[i][j], step + dp[i-1][k] );
	    				dp[i][j] = Math.min(dp[i][j], step + dp[i+1][k] );
    				}
    			}
    		}
    	}
    	
//    	for (int i = 0 ; i <= ks ; i++)
//    		System.out.println(Arrays.toString(dp[i]));
    	
//        return dp[ks][rs-1] + ks;
    	return dp[0][0] + ks;
    }
	
	public static void main(String[] args) {
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE + 1);
//		System.exit(0);
		LC0514_FreedomTrail_X t = new LC0514_FreedomTrail_X();
		System.out.println(t.findRotateSteps("nyngl", "yyynnnnnnlllggg"));
		System.out.println(t.findRotateSteps("abcde", "ade"));
		System.out.println(t.findRotateSteps("godding", "gd"));
	}
}
