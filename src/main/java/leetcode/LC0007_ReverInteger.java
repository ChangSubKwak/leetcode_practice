package leetcode;

public class LC0007_ReverInteger {
	public int reverse(int x) {
		StringBuilder sb = new StringBuilder(String.valueOf(x));
		
		long res;
		if (x >= 0) {
			res = Long.valueOf(sb.reverse().toString());
			if (res > Integer.MAX_VALUE)
				res = 0;
		}
		else {
			res = Long.valueOf("-" + sb.reverse().substring(0, sb.length() - 1));
			if (res < Integer.MIN_VALUE)
				res = 0;
		}
		
		return (int)res;
    }
	
	public static void main(String[] args) {
		LC0007_ReverInteger lc = new LC0007_ReverInteger();
		
		System.out.println(lc.reverse(1534236469));
		System.out.println(lc.reverse(123));
		System.out.println(lc.reverse(-123));
		System.out.println(lc.reverse(120));
	}
}
