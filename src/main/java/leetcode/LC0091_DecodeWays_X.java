package leetcode;

// 62, 70, 509
public class LC0091_DecodeWays_X {
    public int numDecodings(String s) {
    	int len = s.length();
    	int[] dp = new int[len+1];
    	
    	if (s.length() == 1) return s.charAt(0) == '0' ? 0 : 1;
    	
    	dp[0] = 1;
    	if (s.charAt(0) =='0') dp[1] = 0; 
    	else				   dp[1] = 1;
    	
    	for (int i = 2 ; i <= len ; i++) {
    		int one = Integer.valueOf(s.substring(i-1, i));
    		int two = Integer.valueOf(s.substring(i-2, i));
    		
    		if (1 <= one && one <= 9)   dp[i] += dp[i-1];
    		if (10 <= two && two <= 26) dp[i] += dp[i-2];
    	}
    	return dp[len];
    }
	
	public static void main(String[] args) {
		LC0091_DecodeWays_X t = new LC0091_DecodeWays_X();
		System.out.println(t.numDecodings("12"));
		System.out.println(t.numDecodings("226"));
		System.out.println(t.numDecodings("0"));
	}
}
