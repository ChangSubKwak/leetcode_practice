package leetcode;

public class LC0013_Roman_to_Integer {
	public int romanToInt(String s) {
		int i = 0;
		int sum = 0;
		while (i < s.length()) {
			if (0 < s.length() - i && s.charAt(i) == 'V') {
				if (3 < s.length() - i && s.startsWith("VIII", i)) {
					sum += 8;
					i += 4;
					continue;
				}

				if (2 < s.length() - i && s.startsWith("VII", i)) {
					sum += 7;
					i += 3;
					continue;
				}

				if (1 < s.length() - i && s.startsWith("VI", i)) {
					sum += 6;
					i += 2;
					continue;
				}

				sum += 5;
				i += 1;
				continue;
			}

			if (0 < s.length() - i && s.charAt(i) == 'L') {
				if (3 < s.length() - i && s.startsWith("LXXX", i)) {
					sum += 80;
					i += 4;
					continue;
				}

				if (2 < s.length() - i && s.startsWith("LXX", i)) {
					sum += 70;
					i += 3;
					continue;
				}

				if (1 < s.length() - i && s.startsWith("LX", i)) {
					sum += 60;
					i += 2;
					continue;
				}

				sum += 50;
				i += 1;
				continue;
			}

			if (0 < s.length() - i && s.charAt(i) == 'D') {
				if (3 < s.length() - i && s.startsWith("DCCC", i)) {
					sum += 800;
					i += 4;
					continue;
				}

				if (2 < s.length() - i && s.startsWith("DCC", i)) {
					sum += 700;
					i += 3;
					continue;
				}

				if (1 < s.length() - i && s.startsWith("DC", i)) {
					sum += 600;
					i += 2;
					continue;
				}

				sum += 500;
				i += 1;
				continue;
			}

			if (2 < s.length() - i && s.startsWith("III", i)) {
				sum += 3;
				i += 3;
				continue;
			}

			if (2 < s.length() - i && s.startsWith("XXX", i)) {
				sum += 30;
				i += 3;
				continue;
			}

			if (2 < s.length() - i && s.startsWith("CCC", i)) {
				sum += 300;
				i += 3;
				continue;
			}

			if (2 < s.length() - i && s.startsWith("MMM", i)) {
				sum += 3000;
				i += 3;
				continue;
			}

			if (1 < s.length() - i && s.startsWith("IV", i)) {
				sum += 4;
				i += 2;
				continue;
			}

			if (1 < s.length() - i && s.startsWith("IX", i)) {
				sum += 9;
				i += 2;
				continue;
			}

			if (1 < s.length() - i && s.startsWith("XL", i)) {
				sum += 40;
				i += 2;
				continue;
			}

			if (1 < s.length() - i && s.startsWith("XC", i)) {
				sum += 90;
				i += 2;
				continue;
			}

			if (1 < s.length() - i && s.startsWith("CD", i)) {
				sum += 400;
				i += 2;
				continue;
			}

			if (1 < s.length() - i && s.startsWith("CM", i)) {
				sum += 900;
				i += 2;
				continue;
			}

			if (1 < s.length() - i && s.startsWith("II", i)) {
				sum += 2;
				i += 2;
				continue;
			}

			if (1 < s.length() - i && s.startsWith("XX", i)) {
				sum += 20;
				i += 2;
				continue;
			}

			if (1 < s.length() - i && s.startsWith("CC", i)) {
				sum += 200;
				i += 2;
				continue;
			}

			if (1 < s.length() - i && s.startsWith("MM", i)) {
				sum += 2000;
				i += 2;
				continue;
			}

			if (0 < s.length() - i && s.charAt(i) == 'I') {
				sum += 1;
				i += 1;
				continue;
			}

			if (0 < s.length() - i && s.charAt(i) == 'V') {
				sum += 5;
				i += 1;
				continue;
			}

			if (0 < s.length() - i && s.charAt(i) == 'X') {
				sum += 10;
				i += 1;
				continue;
			}

			if (0 < s.length() - i && s.charAt(i) == 'L') {
				sum += 50;
				i += 1;
				continue;
			}

			if (0 < s.length() - i && s.charAt(i) == 'C') {
				sum += 100;
				i += 1;
				continue;
			}

			if (0 < s.length() - i && s.charAt(i) == 'D') {
				sum += 500;
				i += 1;
				continue;
			}

			if (0 < s.length() - i && s.charAt(i) == 'M') {
				sum += 1000;
				i += 1;
				continue;
			}
		}

		return sum;
	}

	/*
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
    */
}
