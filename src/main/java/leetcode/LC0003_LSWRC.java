package leetcode;

import java.util.ArrayList;

public class LC0003_LSWRC {
    public int lengthOfLongestSubstring4(String s) {
        int n = s.length(), ans = 0;
        //int[] index = new int[128]; // current index of character
        int[] index = new int[26]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j) - 'a'], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j) - 'a'] = j + 1;
        }
        return ans;
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
		System.out.println(lc.lengthOfLongestSubstring4("dvdf"));
	}
}
