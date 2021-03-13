package leetcode;

public class LC1576_ReplaceAllstoAvoidConsecutiveRepeatingCharacters {
    public String modifyString(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        
        if (s.length() == 1 && "?".equals(s)) {
            sb.setCharAt(0, 'a');
            return sb.toString();
        }
        else if (s.length() == 1) return s;
        
        if (sb.charAt(0) == '?' && sb.charAt(1) != '?') {
            int next = sb.charAt(1) - 'a';
            next++;
            next %= 26;
            sb.setCharAt(0, (char)('a' + next ));
        }
        else if (sb.charAt(0) == '?' && sb.charAt(1) == '?') {
        	sb.setCharAt(0, (char)('a'));
        }
        for (int i = 1 ; i < sb.length() - 1 ; i++){
        	int prev = sb.charAt(i - 1) - 'a';
            int next = sb.charAt(i + 1) - 'a';
            
            int curr = 0;
            if (sb.charAt(i) == '?' && sb.charAt(i + 1) != '?') {
            	curr = ( prev + 1 ) % 26;
            	if (curr == next) 
            		curr = ( prev + 2 ) % 26;
            	
            	sb.setCharAt(i, (char)('a' + curr ));
            
            } 
            else if (sb.charAt(i) == '?' && sb.charAt(i + 1) == '?') {
                prev++;
                prev %= 26;
                sb.setCharAt(i, (char)('a' + prev ));
            } 
        }
        
        if (sb.charAt(sb.length() - 1) == '?') {
            int prev = sb.charAt(sb.length() - 2) - 'a';
            prev++;
            prev %= 26;
            sb.setCharAt(sb.length() - 1, (char)('a' + prev ));
        }
        
        return sb.toString();
    }

	public static void main(String[] args) {
		LC1576_ReplaceAllstoAvoidConsecutiveRepeatingCharacters lc = new LC1576_ReplaceAllstoAvoidConsecutiveRepeatingCharacters();
//		System.out.println(lc.modifyString("?zs"));
//		System.out.println(lc.modifyString("j?qg??b"));
//		System.out.println(lc.modifyString("??yw?ipkj?"));
		System.out.println(lc.modifyString("ubv?w"));
		
		
	}

}
