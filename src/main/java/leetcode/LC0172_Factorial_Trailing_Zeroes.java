package leetcode;

public class LC0172_Factorial_Trailing_Zeroes {
    public int trailingZeroes(int n) {
        if (n == 0) {
            return 0;
        }
        
        int trailingValue = 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            trailingValue *= i;
            while(trailingValue % 10 == 0) {
                trailingValue /= 10;
                count++;
            }
            trailingValue %= (int)(Math.pow(10, (int)(Math.log10(i)) + 1));
        }
        return count;
    }
}
