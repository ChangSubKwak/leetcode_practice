package leetcode;

public class LC0044_WildcardMatching_X {
//    public boolean isMatch(String s, String p) {
//    	if (p.indexOf('*') < 0 && p.indexOf('?') < 0) return s.equals(p);
//    	int pIdx = 0;
//    	for (int i = 0 ; i < s.length() ; i++) {
//    		if (s.charAt(i) == p.charAt(pIdx)) { pIdx++; continue; }
//    		if (p.charAt(pIdx) == '?') { pIdx++; continue; }
//    		if (pIdx < p.length() - 1 && s.charAt(i) == p.charAt(pIdx+1) ) { pIdx+=2; continue; }
//    		if (p.charAt(pIdx) == '*') continue;
//    		return false;
//    	}
//        return true;
//    }
	
    public boolean isMatch(String s, String p) {
    	if (p.indexOf('*') < 0 && p.indexOf('?') < 0) return s.equals(p);
    	int sIdx = 0, pIdx = 0, matchIdx = 0, starIdx = -1;
    	
    	while(sIdx < s.length() ) {
    		if (pIdx < p.length() && p.charAt(pIdx) == '?') {
    			sIdx++;
    			pIdx++;
    			continue;
    		}
    		if (pIdx < p.length() && s.charAt(sIdx) == p.charAt(pIdx)) {
    			sIdx++;
    			pIdx++;
    			continue;
    		}
    		
    		if (pIdx < p.length() && p.charAt(pIdx) == '*' ) {
    			starIdx = pIdx;
    			matchIdx = sIdx;
    			pIdx++;
    			continue; 
    		}
    		
    		if (starIdx != -1) {
    			pIdx = starIdx + 1;
    			matchIdx++;
    			sIdx = matchIdx - 1;
    			continue;
    		}
    		return false;
    	}
    	
    	while( pIdx < p.length() && p.charAt(pIdx) == '*')
    		pIdx++;
    	
    	return pIdx == p.length(); 
    }
	
	public static void main(String[] args) {
		LC0044_WildcardMatching_X t = new LC0044_WildcardMatching_X();
//		System.out.println(t.isMatch("aa", "a"));
//		System.out.println(t.isMatch("aa", "*"));
//		System.out.println(t.isMatch("cb", "?a"));
//		System.out.println(t.isMatch("adceb", "*a*b"));
//		System.out.println(t.isMatch("acdcb", "a*c?b"));
		System.out.println(t.isMatch("abcabczzzde", "*abc???de*"));
	}
}
