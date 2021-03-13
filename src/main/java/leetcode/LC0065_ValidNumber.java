package leetcode;

public class LC0065_ValidNumber {
	/*
    public boolean isNumber(String s) {
        s = s.trim();

        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;
        for(int i=0; i<s.length(); i++) {
            if('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                numberSeen = true;
                numberAfterE = true;
            } else if(s.charAt(i) == '.') {
                if(eSeen || pointSeen) {
                    return false;
                }
                pointSeen = true;
            } else if(s.charAt(i) == 'e') {
                if(eSeen || !numberSeen) {
                    return false;
                }
                numberAfterE = false;
                eSeen = true;
            } else if(s.charAt(i) == '-' || s.charAt(i) == '+') {
                if(i != 0 && s.charAt(i-1) != 'e') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return numberSeen && numberAfterE;
    }

	*/
	
    public boolean isNumber(String s) {
    	s = s.trim();
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0 ; i < s.length() ; i++) {
    		if (Character.isAlphabetic(s.charAt(i)))
    			sb.append(Character.toLowerCase(s.charAt(i)));
    		else sb.append(s.charAt(i));
    	}
    	s = sb.toString();
    	
    	int len = s.length();
    	int alphaNum[] = new int[26];
    	int dNum = 0;
    	int mNum = 0;
    	int pNum = 0;
    	int pointNum = 0;
    	int spaceNum = 0;

    	int minusIdx = -1;
    	int plusIdx = -1;
    	int eIdx = -1;
    	for (int i = 0 ; i < len ; i++) {
    		if (Character.isAlphabetic(s.charAt(i)))
    			alphaNum[s.charAt(i) - 'a']++;
    		if (s.charAt(i) == 'e')
    			eIdx = i;
    		
    		if (s.charAt(i) == '.') pointNum++;
    		if (s.charAt(i) == ' ') spaceNum++;
    		if (s.charAt(i) == '-') {
    			mNum++;
    			minusIdx = i;
    		}
    		if (s.charAt(i) == '+') {
    			pNum++;
    			plusIdx = i;
    		}
    		if (Character.isDigit(s.charAt(i)))
    			dNum++;
    	}
    	
    	if (minusIdx > 0 && s.charAt(minusIdx-1) != 'e') return false;
    	if (minusIdx > 0 && minusIdx == s.length() - 1) return false;
    	if (plusIdx > 0 && s.charAt(plusIdx-1) != 'e') return false;
    	if (plusIdx > 0 && plusIdx == s.length() - 1) return false;
    	if (dNum <= 0) return false;
    	if (pointNum >= 2) return false;
    	if (spaceNum >= 1) return false;
    	
    	for (int i = 0 ; i < 26 ; i++) {
    		if (i == 4 && alphaNum[i] > 1) return false;
    		if (i != 4 && alphaNum[i] > 0) return false;
    	}
    	
    	if (eIdx != -1) {
    		if (eIdx == 0) return false;
    		String beforeE = s.substring(0, eIdx);
    		
    		dNum = 0;
    		for (int i = 0 ; i < beforeE.length() ; i++)
    			if (Character.isDigit(beforeE.charAt(i))) dNum++;
    		if (dNum <= 0 ) return false;
    		
    		
    		String afterE = s.substring(eIdx + 1);
//    		System.out.println(beforeE);
//    		System.out.println(afterE);
    		if (afterE.contains("-") && (mNum - 1 + pNum) >= 2 ) return false; 
    		
    		if (afterE.contains(".")) return false;
    		if (afterE.length() <= 0) return false;
    	}
    	
//    	if ((mNum + pNum) >= 2 ) return false;
    	
        return true;
    }
	
	public static void main(String[] args) {
		LC0065_ValidNumber t = new LC0065_ValidNumber();
//		System.out.println(t.isNumber("0"));
//		System.out.println(t.isNumber(" 0.1"));
//		System.out.println(t.isNumber("abc"));
//		System.out.println(t.isNumber("1 a"));
//		System.out.println(t.isNumber("2e10"));
//		System.out.println(t.isNumber(" -90e3    "));
//		System.out.println(t.isNumber("  1e"));
//		System.out.println(t.isNumber("e3"));
//		System.out.println(t.isNumber("6e-1"));
//		System.out.println(t.isNumber(" 99e2.5"));
//		System.out.println(t.isNumber("53.5e93"));
//		System.out.println(t.isNumber(" --6 "));
//		System.out.println(t.isNumber("-+3 "));
//		System.out.println(t.isNumber("95a54e53"));
//		System.out.println(t.isNumber("."));
//		System.out.println(t.isNumber(".e1"));
//		System.out.println(t.isNumber("Re7"));
//		System.out.println(t.isNumber("32.e-80123"));
//		System.out.println(t.isNumber(" -.7e+0435"));		// true
//		System.out.println(t.isNumber(" +0e-"));			// false
		System.out.println(t.isNumber("+42e+76125"));		// true
	}
}
