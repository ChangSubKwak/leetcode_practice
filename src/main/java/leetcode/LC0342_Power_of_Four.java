package leetcode;

public class LC0342_Power_of_Four {
    public boolean isPowerOfFour(int n) {
        for (int i = 0; i <= 15; i++) {
            int powNum = (int)(Math.pow(4, i));
            if (n == powNum) {
                return true;
            }
        }
        return false;
    }
}
