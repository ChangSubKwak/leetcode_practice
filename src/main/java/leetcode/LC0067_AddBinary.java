package leetcode;

public class LC0067_AddBinary {
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
//    public String addBinary(String a, String b) {
//    	if (a.length() < b.length()) {
//    		String temp = a;
//    		a = b;
//    		b = temp;
//    	}
//    	
//    	int lenA = a.length();
//    	int lenB = b.length();
//    	
//    	StringBuilder sb = new StringBuilder();
//    	int carry = 0;
//    	for (int i = lenB - 1 ; i >= 0; i--) {
//    		//int iA = (lenA == lenB) ? a.charAt(i) - '0' : a.charAt(lenA - i - 1) - '0';
//    		int iA = a.charAt(i) - '0';
//    		int iB = b.charAt(i) - '0';
//    		
//    		if (iA + iB + carry >= 2) {
//    			sb.append((iA + iB + carry)%2);
//    			carry = 1;
//    		} else {
//    			sb.append((iA + iB + carry)%2);
//    			carry = 0;
//    		}
//    	}
//    	
//    	for (int i = lenA - lenB - 1 ; i >= 0; i--) {
//    		int iA = a.charAt(i) - '0';
//    		if (iA + carry >= 2) {
//    			sb.append((iA + carry)%2);
//    			carry = 1;
//    		} else {
//    			sb.append((iA + carry)%2);
//    			carry = 0;
//    		}
//    	}
//    	
//    	if (carry == 1)
//    		sb.append(1);
//    	
//        return sb.reverse().toString();
//    }
	
	public static void main(String[] args) {
		LC0067_AddBinary t = new LC0067_AddBinary();
		System.out.println(t.addBinary("110010","10111"));
		System.out.println(t.addBinary("100","110010"));
		System.out.println(t.addBinary("11","1"));
		System.out.println(t.addBinary("1010","1011"));
	}
}
