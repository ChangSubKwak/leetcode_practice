package main.java.leetcode;

public class LC0069_Sqrtx {
    public int mySqrt(int x) {
        long i = 0;
        for (i = 0 ;  ; i++ ) {
        	if (i*i <= x && x < (i+1)*(i+1))
        		break;
        }
        return (int)i;
    }
    
	public static void main(String[] args) {
		LC0069_Sqrtx t = new LC0069_Sqrtx();
		System.out.println(t.mySqrt(4));
		System.out.println(t.mySqrt(8));
		System.out.println(t.mySqrt(2147395600));
	}
}
