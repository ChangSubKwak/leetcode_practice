package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0017_LetterCombinationsofaPhoneNumber {
	public static char[][] baseChar = new char[10][3];
	public static String digits;
	
	public void execute(StringBuilder curStr, int idx, List<String> res) {
		if (idx == digits.length()) {
			res.add(curStr.toString());
			return;
		}
		
		int bcIdx = digits.charAt(idx) - '0';
		for (int i = 0 ; i < baseChar[bcIdx].length ; i++) {
			curStr.append(baseChar[bcIdx][i]);
			execute(curStr, idx + 1, res);
			curStr.deleteCharAt(curStr.length() - 1);
		}
	}
	
	@SuppressWarnings("static-access")
	public List<String> letterCombinations(String digits) {
    	List<String> res = new ArrayList<String>();
    	
    	baseChar[2] = "abc".toCharArray();
    	baseChar[3] = "def".toCharArray();
    	baseChar[4] = "ghi".toCharArray();
    	baseChar[5] = "jkl".toCharArray();
    	baseChar[6] = "mno".toCharArray();
    	baseChar[7] = "pqrs".toCharArray();
    	baseChar[8] = "tuv".toCharArray();
    	baseChar[9] = "wxyz".toCharArray();
    	
    	this.digits = digits;
    	
    	StringBuilder sb = new StringBuilder();
    	if (digits.length() != 0) {
    		execute(sb, 0, res);
    	}
        return res;
    }
	
	public static void main(String[] args) {
		LC0017_LetterCombinationsofaPhoneNumber lc = new LC0017_LetterCombinationsofaPhoneNumber();
		
		System.out.println(lc.letterCombinations("23"));
	}
}
