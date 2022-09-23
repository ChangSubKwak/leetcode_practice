package leetcode;

public class LC1680_Concatenation_of_Consecutive_Binary_Numbers {
    public int minOperations(int n) {
        long sum = 0 ;
       	for (int i = 1 ; i <= n ; i++) {
       		int logVal = (int)(Math.log(i) / Math.log(2)) + 1;
       		sum = ( ( sum << logVal ) + i ) % 1_000_000_007;
       	}
       	return (int)sum;
    }
}
