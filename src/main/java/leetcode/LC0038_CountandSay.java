package main.java.leetcode;

public class LC0038_CountandSay {
    public String countAndSay(int n) {
    	String s = new String("1");
    	
    	StringBuilder sb = new StringBuilder(s);
    	for (int j = 1 ; j < n ; j++) {
        	int si = 0;
	    	sb = new StringBuilder();
	    	while(si < s.length()) {
	    		int i = 0;
	    		while(si + i + 1 < s.length() && s.charAt(si+i) == s.charAt(si+i+1)) i++;
	    		sb.append(i+1);
	    		sb.append(s.charAt(si));
	    		si+= i+1;
	    	}
	    	s = sb.toString();
    	}
    	
        return sb.toString();
    }
    
	public static void main(String[] args) {
		LC0038_CountandSay t = new LC0038_CountandSay();
//		t.countAndSay(1);
		System.out.println(t.countAndSay(1));
		System.out.println(t.countAndSay(2));
		System.out.println(t.countAndSay(3));
		System.out.println(t.countAndSay(4));
	}
}
