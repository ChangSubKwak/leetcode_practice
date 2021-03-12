package main.java.leetcode;

public class LC0012_IntegertoRoman {
	
	public String createPattern(int base, int digit) {
		String s1 = new String();
		String s2 = new String();
		String s3 = new String();
		
		if (base == 1) {
			s1 = "I";	s2 = "V";	s3 = "X";
		} else if (base == 10) {
			s1 = "X";	s2 = "L";	s3 = "C";
		} else if (base == 100) {
			s1 = "C";	s2 = "D";	s3 = "M";
		} else if (base == 1000) {
			s1 = "M";
		}
		
		StringBuilder sb = new StringBuilder();
    	if 		(digit == 1) sb.append(s1);
    	else if (digit == 2) sb.append(s1+s1);
    	else if (digit == 3) sb.append(s1+s1+s1);
    	else if (digit == 4) sb.append(s1+s2);
    	else if (digit == 5) sb.append(s2);
    	else if (digit == 6) sb.append(s2+s1);
    	else if (digit == 7) sb.append(s2+s1+s1);
    	else if (digit == 8) sb.append(s2+s1+s1+s1);
    	else if (digit == 9) sb.append(s1+s3);
    	else if (digit == 10) sb.append(s3);
    	
    	return sb.toString();
	}
	
    public String intToRoman(int num) {
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 1000 ; i >= 1 ; i/=10 ) {
    		if (num == 0) break;
    		int quotient = num / i;
    		num = num % i;
    		
    		if (quotient == 0)
    			continue;
    		
    		sb.append(createPattern(i, quotient));
    	}
    	
    	return sb.toString();
    }
	
	public static void main(String[] args) {
		LC0012_IntegertoRoman lc = new LC0012_IntegertoRoman();
		
		System.out.println(lc.intToRoman(3));
		System.out.println(lc.intToRoman(4));
		System.out.println(lc.intToRoman(9));
		System.out.println(lc.intToRoman(58));
		System.out.println(lc.intToRoman(1994));
		
	}
}
