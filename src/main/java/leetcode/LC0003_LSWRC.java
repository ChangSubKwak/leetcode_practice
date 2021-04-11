package leetcode;

import java.util.ArrayList;

public class LC0003_LSWRC {
    public int lengthOfLongestSubstring4(String s) {
        int n = s.length(), ans = 0;
        int[] lastIndex = new int[128];

        for (int end = 0, start = 0; end < n; end++) {
            start = Math.max(lastIndex[s.charAt(end)], start);
            lastIndex[s.charAt(end)] = end + 1;
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
    
    public int lengthOfLongestSubstring3(String s) {
        int len = s.length();
        int max = 0;
        boolean isContains = false;
        for (int i = 0 ; i < len ; i++) {
            for (int j = i ; j < len ; j++) {
                String ts = s.substring(i, j);
                // System.out.println(i + " , " + j + " , " + ts + " , " + s.charAt(j) + " --> " + ts.contains(s.charAt(j) + ""));
                if (ts.contains(s.charAt(j) + "")) {
                    if (max < j - i)
                        max = j - i;
                    isContains = true;
                    break;
                }
                
                //System.out.println( (j == len - 1) + " --> max(" + max + ")" + " --> " + (j - i) );
                if (j == len - 1 && max < j - i + 1) {
                    max = j - i + 1;
                }
            }
        }
        
        if (!isContains) return len;
        return max;
    }
	
	
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        int idx = 0, max = -999, count = 0;
        if (l < 2) return l;
        
        ArrayList<Character> al = new ArrayList<>();
        while (idx < l) {
            if (al.contains(s.charAt(idx))) {
                if (max < count) {
                    max = count;
                }
                al.clear();
                idx = idx - count;
                count = 0;
            } else {
                al.add(s.charAt(idx));
                count++;
            }
            idx++;
        }
        
        if (max < count) max = count;
        
        return max;
    }
	
	public static void main(String[] args) {
		LC0003_LSWRC lc = new LC0003_LSWRC();
//		System.out.println(lc.lengthOfLongestSubstring("abcancbb"));
//		System.out.println(lc.lengthOfLongestSubstring("pwwkew"));
//		System.out.println(lc.lengthOfLongestSubstring("au"));
//		System.out.println(lc.lengthOfLongestSubstring("dvdf"));
//		System.out.println(lc.lengthOfLongestSubstring4("dvdf"));
		System.out.println(lc.lengthOfLongestSubstring4(" "));
	}
}
