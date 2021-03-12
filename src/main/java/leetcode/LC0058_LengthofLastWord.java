package main.java.leetcode;

public class LC0058_LengthofLastWord {
    public int lengthOfLastWord(String s) {
    	s = s.trim();
    	int len = s.length();
    	int i = 0;
    	for (i = len - 1 ; i >= 0 ; i--) {
    		if (s.charAt(i) == ' ')
    			break;
    	}
        return len - 1 - i;
    }
	
	public static void main(String[] args) {
		LC0058_LengthofLastWord t = new LC0058_LengthofLastWord();
		System.out.println(t.lengthOfLastWord("Hello World"));
		System.out.println(t.lengthOfLastWord(" "));
		System.out.println(t.lengthOfLastWord("a "));
	}
}
