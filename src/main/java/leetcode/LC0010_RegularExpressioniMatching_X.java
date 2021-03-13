package leetcode;
// Cannot solve
public class LC0010_RegularExpressioniMatching_X {
    public boolean isMatch(String s, String p) {
    	return false;
    }
	/*
    public boolean isMatch(String s, String p) {
    	if (s.equals(p))
    		return true;
    	if (p.length() == 0)
    		return false;
    	
    	int i1 = 0, i2 = 0;
    	
    	if (p.lastIndexOf('*') != p.length() - 1) {
    		i1 = s.length() - 1;
    		i2 = p.length() - 1;
    		
    		while (i1 >= 0 && i2 >= 0 && (s.charAt(i1) == p.charAt(i2) || '.' == p.charAt(i2))) {
    			i1--;
    			i2--;
    		}
    		
    		s = s.substring(0, i1+1);
        	p = p.substring(0, i2+1);
    	}
    	
    	if (s.length() == 0 && p.length() == 0)
    		return true;
    	
    	if (p.length() == 0)
    		return false;
    	
    	i1 = i2 = 0;
    	boolean isMatch = false; 
    	while (i1 < s.length() && i2 < p.length()) {
    		if (s.charAt(i1) == p.charAt(i2) || '.' == p.charAt(i2)) {
    			i1++;
    			i2++;
    			
    			char pivot = p.charAt(i2 - 1);
    			boolean isAny = pivot == '.';
    			if (i2 < p.length() && p.charAt(i2) == '*') {
    				while(i1 < s.length() && (s.charAt(i1) == pivot || isAny))
    					i1++;
    				i2++;
    			}
    			
    		} else if (s.charAt(i1) != p.charAt(i2) &&
    				   i2+1 < p.length() &&
    				   '*' == p.charAt(i2+1)) {
    			i2+=2;
    		}
    	}
    	
    	while (i2+1 < p.length() && '*' == p.charAt(i2+1) )
    		i2+=2;
    	
    	isMatch = (i1 == s.length() && i2 == p.length());
        return isMatch;
    }
    //*/
	
	public static void main(String[] args) {
		LC0010_RegularExpressioniMatching_X lc = new LC0010_RegularExpressioniMatching_X();
		System.out.println(lc.isMatch("ab", ".*..c*") + " ----> true");
		System.out.println(lc.isMatch("aaa", "a.a") + " ----> true");
		System.out.println(lc.isMatch("ab", ".*..") + " ----> true");
		System.out.println(lc.isMatch("aaa", "ab*a*c*a") + " ----> true");
		System.out.println(lc.isMatch("aaa", "ab*a") + " ----> false");
		System.out.println(lc.isMatch("aaa", "a*a")  + " ----> true");
		System.out.println(lc.isMatch("mississippi", "mis*is*p*.")  + " ----> false");
		System.out.println(lc.isMatch("ab", ".*c")  + " ----> false");
		System.out.println(lc.isMatch("abcd", "d*")  + " ----> false");
		System.out.println(lc.isMatch("aab", "c*a*b")  + " ----> false");
		System.out.println(lc.isMatch("aa", "a*")  + " ----> true");
		System.out.println(lc.isMatch("aaaaaaaaaaa", "a*") + " ----> true");
		System.out.println(lc.isMatch("aa", "a")  + " ----> false");
		System.out.println(lc.isMatch("ab", ".*")  + " ----> true");
		
	}
}
