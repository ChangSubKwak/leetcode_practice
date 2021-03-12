package main.java.leetcode;

public class LC0029_DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
    	if (dividend == Integer.MIN_VALUE && divisor == -1)
    		return Integer.MAX_VALUE;
    	
    	int result = dividend / divisor;
        return result;
    }
	
	public static void main(String[] args) {
		LC0029_DivideTwoIntegers t = new LC0029_DivideTwoIntegers();
		System.out.println(t.divide(10, 3));
		System.out.println(t.divide( 7,-3));
		System.out.println(t.divide(-2147483648, -1));
	}
}
