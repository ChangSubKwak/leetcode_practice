package main.java.leetcode;

public class LC1680_ConcatenationofConsecutiveBinaryNumbers {
    public int concatenatedBinary(int n) {
    	long sum = 0 ;
    	for (int i = 1 ; i <= n ; i++) {
    		int logVal = (int)(Math.log(i) / Math.log(2)) + 1;
    		//sum = ( ( sum << logVal ) + i ) % 1_000_000_007;
    		sum = ( ( sum << logVal ) + i ) % 1_000_000_007;
    	}
    	return (int)sum;
    }

	public static void main(String[] args) {
		LC1680_ConcatenationofConsecutiveBinaryNumbers t = new LC1680_ConcatenationofConsecutiveBinaryNumbers();
		//System.out.println(t.concatenatedBinary(3));
		System.out.println(t.concatenatedBinary(12));
	}
}
