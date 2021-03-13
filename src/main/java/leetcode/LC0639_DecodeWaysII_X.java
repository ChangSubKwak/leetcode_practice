package leetcode;

// 62, 70, 509
public class LC0639_DecodeWaysII_X {
    public int numDecodings(String s) {
    	long[] dp = new long[s.length() + 1];

    	dp[0] = 1;
    	if (s.charAt(0) == '0') return 0;
    	dp[1] = (s.charAt(0) == '*') ? 9 : 1;
    	
    	for (int i = 2 ; i <= s.length() ; i++) {
    		char first  = s.charAt(i-2);
    		char second = s.charAt(i-1);
    		
    		if      (second == '*') dp[i] += 9*dp[i-1];
    		else if (second >= '1') dp[i] += dp[i-1];
    		
    		if (first == '*') {
    			if      (second == '*') dp[i] += 15*dp[i-2];			// 11 ~ 26
    			else if (second <= '6') dp[i] +=  2*dp[i-2];			// 16, 26
    			else                    dp[i] +=    dp[i-2];            // just one
    		}
    		else if (first == '1' || first == '2') {
    			if (second == '*') {
    				if (first == '1') dp[i] += 9*dp[i-2];
    				else              dp[i] += 6*dp[i-2];
    			} else if ( ((first - '0')*10 + (second-'0')) <= 26) {
    				dp[i] += dp[i-2];
    			}
    		}
    		dp[i] %= 1000000007;
    	}
    	
    	return (int)dp[s.length()];
    }
	
	public static void main(String[] args) {
		LC0639_DecodeWaysII_X t = new LC0639_DecodeWaysII_X();
		System.out.println(t.numDecodings("*"));
		System.out.println(t.numDecodings("*1"));
		System.out.println(t.numDecodings("1*"));
		System.out.println(t.numDecodings("**"));
		System.out.println(t.numDecodings("0*"));
		System.out.println(t.numDecodings("*1*"));
		System.out.println(t.numDecodings("***"));
		System.out.println(t.numDecodings("****"));
//		System.out.println(t.numDecodings("226"));
//		System.out.println(t.numDecodings("0"));
	}
}
