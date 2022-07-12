package leetcode;

import java.util.Arrays;

public class LC0473_Matchsticks_to_Square {
    public boolean makesquare(int[] matchsticks) {
        
        int total = Arrays.stream(matchsticks).sum();
        if (total % 4 != 0) {
            return false;
        }
        
        Arrays.sort(matchsticks);
        return match(matchsticks, matchsticks.length - 1, 0, 0, 0, 0, total / 4);
    }
    
    public boolean match(int[] matchsticks, int index, int top, int bottom, int left, int right, int target) {
        
        if (top == target && bottom == target && left == target && right == target) {
            return true;
        }
        
        if (top > target || bottom > target || left > target || right > target) {
            return false;
        }
        
        int val = matchsticks[index];
        return
            match(matchsticks, index - 1, top + val, bottom, left, right, target) ||
            match(matchsticks, index - 1, top, bottom + val, left, right, target) ||
            match(matchsticks, index - 1, top, bottom, left + val, right, target) ||
            match(matchsticks, index - 1, top, bottom, left, right + val, target);
    }
}
