package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC0093_RestoreIPAddresses {
	public Set<String> set;
	
	public void exec(List<String> res, String s, int orgLen, StringBuilder sb, int depth) {
		if (depth == 4 && ((orgLen+4) == sb.length()) ) {
			res.add(sb.substring(0, sb.length() - 1));
			return;
		}
		int len = s.length();
		String t = null;
		
		if (len >= 1) {
			t = s.substring(0, 1);
			if (0 <= Integer.valueOf(t) && Integer.valueOf(t) <= 9) {
				sb.append(t + ".");
				exec(res, s.substring(1), orgLen, sb, depth + 1);
				sb.setLength(sb.length() - 2);
			}
		}
		if (len >= 2) {
			t = s.substring(0, 2);
			if (10 <= Integer.valueOf(t) && Integer.valueOf(t) <= 99) {
				sb.append(t + ".");
				exec(res, s.substring(2), orgLen, sb, depth + 1);
				sb.setLength(sb.length() - 3);
			}
		}
		if (len >= 3) {
			t = s.substring(0, 3);
			if (100 <= Integer.valueOf(t) && Integer.valueOf(t) <= 255) {
				sb.append(t + ".");
				exec(res, s.substring(3), orgLen, sb, depth + 1);
				sb.setLength(sb.length() - 4);
			}
		}
		
	}
	
    public List<String> restoreIpAddresses(String s) {
    	int len = s.length();

    	List<String> res = new ArrayList<String>();
    	if (s.length() < 4 || s.length() > 12) return res;
    	
    	set = new HashSet<String>();
    	exec(res, s, len, new StringBuilder(), 0);
    	
    	return res;
    }
	
	public static void main(String[] args) {
		LC0093_RestoreIPAddresses t = new LC0093_RestoreIPAddresses();
		//System.out.println(t.restoreIpAddresses("25525511135"));
		System.out.println(t.restoreIpAddresses("25525511135"));
	}
}
