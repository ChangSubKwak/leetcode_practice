package leetcode;

import java.math.BigInteger;

public class LC0043_MultiplyStrings {
    public String multiply(String num1, String num2) {
    	BigInteger b1 = new BigInteger(num1);
    	BigInteger b2 = b1.multiply(new BigInteger(num2));
        return b2.toString();
    }
    
	public static void main(String[] args) {
		LC0043_MultiplyStrings t = new LC0043_MultiplyStrings();
		System.out.println(t.multiply("2", "3"));
		System.out.println(t.multiply("123", "456"));
	}
}
