package leetcode;

public class LC0326_Power_of_Three {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        
        while (n > 1) {
            if ((n % 3) != 0) {
                return false;
            }
            n /= 3;
        }
        
        return true;
    }
}
