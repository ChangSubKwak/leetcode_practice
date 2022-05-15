package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC0202_Happy_Number {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        
        int sum = 0;
        while(sum != 1) {
            String s = String.valueOf(n);
            sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += Math.pow((int)(s.charAt(i) - '0'), 2);
            }
            
            n = sum;
            if (set.contains(sum)) {
                return false;
            }
            set.add(sum);
        }
        return true;
    }
}
