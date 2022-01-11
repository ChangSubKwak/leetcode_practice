package leetcode;

public class LC0067_Add_Binary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int aLen = a.length();
        int bLen = b.length();
        
        if (aLen < bLen) {
            String temp = a;
            a = b;
            b = temp;
            
            int tempLen = aLen;
            aLen = bLen;
            bLen = tempLen;
        }
        
        int carry = 0;
        for (int i = aLen - 1, j = bLen - 1; i >= 0; i--, j--) {
            int value = (a.charAt(i) - '0') + (j >= 0 ? (b.charAt(j) - '0') : 0);
            value += carry;
            carry = value >= 2 ? 1 : 0;
            value %= 2;
            
            sb.insert(0, value);
        }
        
        if (carry == 1) {
            sb.insert(0, "1");
        }
        
        return sb.toString();
    }
	
	/*
    public String addBinary(String a, String b) {
		if (a.length() < b.length()) {
		    String temp = a;
		    a = b;
		    b = temp;
		}
		  
		int lenA = a.length();
		int lenB = b.length();
		  
		StringBuilder sb = new StringBuilder(b);
		sb.reverse();
		for (int i = 0 ; i < lenA - lenB ; i++) {
		    sb.append(0);
		}
		b = sb.reverse().toString();
		sb.setLength(0);
		  
		int carry = 0;
		for (int i = lenA - 1 ; i >= 0; i--) {
		    int iA = a.charAt(i) - '0';
			int iB = b.charAt(i) - '0';
			
			if (iA + iB + carry >= 2) {
				sb.append((iA + iB + carry)%2);
				carry = 1;
			} else {
				sb.append((iA + iB + carry)%2);
				carry = 0;
		    }
		}
		  
		if (carry == 1) sb.append(1);
		  
		return sb.reverse().toString();
    }
	*/
	  
	/* 
    public String addBinary(String a, String b) {
		if (a.length() < b.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		
		int lenA = a.length();
		int lenB = b.length();
		
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		for (int i = lenB - 1 ; i >= 0; i--) {
			//int iA = (lenA == lenB) ? a.charAt(i) - '0' : a.charAt(lenA - i - 1) - '0';
			int iA = a.charAt(i) - '0';
			int iB = b.charAt(i) - '0';
			
			if (iA + iB + carry >= 2) {
				sb.append((iA + iB + carry)%2);
				carry = 1;
			} else {
				sb.append((iA + iB + carry)%2);
				carry = 0;
			}
		}
		
		for (int i = lenA - lenB - 1 ; i >= 0; i--) {
			int iA = a.charAt(i) - '0';
			if (iA + carry >= 2) {
				sb.append((iA + carry)%2);
				carry = 1;
			} else {
				sb.append((iA + carry)%2);
				carry = 0;
			}
		}
		
		if (carry == 1)
			sb.append(1);
		
	    return sb.reverse().toString();
	}
	*/
	
	public static void main(String[] args) {
		LC0067_Add_Binary t = new LC0067_Add_Binary();
		System.out.println(t.addBinary("110010","10111"));
		System.out.println(t.addBinary("100","110010"));
		System.out.println(t.addBinary("11","1"));
		System.out.println(t.addBinary("1010","1011"));
	}
}
