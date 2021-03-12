package main.java.leetcode;

public class LC0008_StringtoInteger {
    public int myAtoi(String str) {
    	long lval = 0;
    	str = str.trim();
    	
    	if (str.length() == 0 )
    		return 0;
    	
    	if ( str.charAt(0) != '-' && str.charAt(0) != '+' && 
    		(str.charAt(0) < '0' || str.charAt(0) > '9'))
    		return 0;
    	
    	boolean isSign = str.charAt(0) == '-';
    	if (isSign || str.charAt(0) == '+')
    		str = str.substring(1);
    	
    	int len = str.length();
    	
    	for (int i = 0 ; i < len ; i++) {
    		if (str.charAt(i) < '0' || str.charAt(i) > '9') {
    			str = str.substring(0, i);
    			break;
    		}
    	}
    	
    	len = str.length();
    	for (int i = 0 ; i < len ; i++) {
    		if (str.charAt(i) < '0' || str.charAt(i) > '9')
    			break;
    		lval += ( str.charAt(i) - '0' ) * Math.pow(10, len - i - 1);
    	}
    	
    	if (isSign) {
    		lval = -lval;
    		if (lval < Integer.MIN_VALUE)
    			lval = Integer.MIN_VALUE;
    	} else {
    		if (lval > Integer.MAX_VALUE)
    			lval = Integer.MAX_VALUE;
    	}
    	
        return (int)lval;
    }
	
	public static void main(String[] args) {
		LC0008_StringtoInteger lc = new LC0008_StringtoInteger();
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
		System.out.println(lc.myAtoi("+1"));
		System.out.println(lc.myAtoi("42"));
		System.out.println(lc.myAtoi("    -42"));
		System.out.println(lc.myAtoi("4193 with words"));
		System.out.println(lc.myAtoi("words and 987"));
		System.out.println(lc.myAtoi("-91283472332"));
		
	}
}
