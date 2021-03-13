package leetcode;

public class LC0013_RomantoInteger {
	
	public int decode(int base, String num) {
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
		
    	if 		(num.equals(s1))		return 1*base;
    	else if (num.equals(s1+s1))		return 2*base;
    	else if (num.equals(s1+s1+s1))	return 3*base;
    	else if (num.equals(s1+s2))		return 4*base;
    	else if (num.equals(s2))		return 5*base;
    	else if (num.equals(s2+s1))		return 6*base;
    	else if (num.equals(s2+s1+s1))	return 7*base;
    	else if (num.equals(s2+s1+s1+s1))	return 8*base;
    	else if (num.equals(s1+s3))		return 9*base;

    	return 0;
	}
	
    public int romanToInt(String s) {
    	int num = 0;
    	
    	char[] romanArr = new char[3];
    	for (int base = 1 ; base <= 1000 ; base*= 10) {
	    	int len = s.length();
	    	int w = 0;
	    	
	    	if (base == 1) {
	    		romanArr[0] = 'I';	romanArr[1] = 'V';	romanArr[2] = 'X';
	    	}
	    	else if (base == 10) {
	    		romanArr[0] = 'X';	romanArr[1] = 'L';	romanArr[2] = 'C';
	    	}
	    	else if (base == 100) {
	    		romanArr[0] = 'C';	romanArr[1] = 'D';	romanArr[2] = 'M';
	    	} else {
	    		romanArr[0] = 'M';	romanArr[1] = ' ';	romanArr[2] = ' ';
	    	}
	    	
	    	for(int i = len - 1 ; i >= 0 ; i--) {
	    		if (s.charAt(i) == romanArr[0] || s.charAt(i) == romanArr[1] ) {
	    			w++;
	    		}
	    		else if (s.charAt(i) == romanArr[2]) {
	    			if (i-1 >= 0 && s.charAt(i-1) == romanArr[0]) w += 2;
	    			break;
	    		} else {
	    			break;
	    		}
	    		
	    	}
	    	int digit = decode(base, s.substring(len - w ));
	    	num += digit;
	    	s = s.substring(0, len - w);
	    	
	    	if (s.length() == 0)
	    		break;
    	}
    	
    	return num;
    }
	
	public static void main(String[] args) {
		LC0013_RomantoInteger lc = new LC0013_RomantoInteger();
		
		System.out.println(lc.romanToInt("III"));
		System.out.println(lc.romanToInt("IV"));
		System.out.println(lc.romanToInt("IX"));
		System.out.println(lc.romanToInt("LVIII"));
		System.out.println(lc.romanToInt("MCMXCIV"));
		System.out.println(lc.romanToInt("DCXXI") + " ---> 621");
		
	}
}
