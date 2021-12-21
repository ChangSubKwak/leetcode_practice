package leetcode;

public class LC0231_Power_of_Two {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        
        while(n != 1) {
            int r = n % 2;
            
            if (r == 1 && n != 2) {
                return false;
            }
            
            if (r == 1 && n == 2) {
                return true;
            }
            
            n = n / 2;
            
        }
        
        return true;
    }
}
