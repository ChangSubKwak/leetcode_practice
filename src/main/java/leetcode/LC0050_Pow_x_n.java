package main.java.leetcode;

public class LC0050_Pow_x_n {
    public double myPow(double x, int n) {
    	return (int)(Math.pow(x, n) * 100000) / 100000.0;
    }
    
	public static void main(String[] args) {
		LC0050_Pow_x_n t = new LC0050_Pow_x_n();
		System.out.println(t.myPow(2, 10));
		System.out.println(t.myPow(2.1, 3));
		System.out.println(t.myPow(2, -2));
	}
}
