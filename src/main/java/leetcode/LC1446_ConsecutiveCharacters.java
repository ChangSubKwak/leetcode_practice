package leetcode;

public class LC1446_ConsecutiveCharacters {
    public int maxPower(String s) {
        int len = s.length();
        
        if (len == 1) {
            return 1;
        }
        
        int max = 1;
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (s.charAt(i-1)== s.charAt(i)) {
                count++;
                
                if (max < count) {
                    max = count;
                }
                
                continue;
            }

            count = 1;
        }
        
        return max;
    }
}
