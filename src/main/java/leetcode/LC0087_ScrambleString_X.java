package leetcode;

public class LC0087_ScrambleString_X {
    public boolean isScramble(String s1, String s2) {
    	int len = s1.length();
    	if (s1.equals(s2)) return true;
    	
    	int[] count = new int[26];
    	for(int i = 0 ; i < len ; i++) {
    		count[s1.charAt(i) - 'a']++;
    		count[s2.charAt(i) - 'a']--;
    	}
    	for(int i = 0 ; i < 26 ; i++) 
    		if (count[i] != 0) return false;
    	
    	for (int i = 1 ; i < len ; i++) {
    		if (isScramble(s1.substring(0,i), s2.substring(0,i)) && isScramble(s1.substring(i), s2.substring(i))) return true;
    		if (isScramble(s1.substring(0,i), s2.substring(len - i)) && isScramble(s1.substring(i), s2.substring(0, len - i))) return true;
    	}
    	
        return false;
    }
	
	public static void main(String[] args) {
		LC0087_ScrambleString_X t = new LC0087_ScrambleString_X();
		System.out.println(t.isScramble("great","rgeat"));
		System.out.println(t.isScramble("abcde","caebd"));
		System.out.println(t.isScramble("a","a"));
	}
}
