package leetcode;

public class LC0878_Nth_Magical_Number_X {
    public int nthMagicalNumber(int n, int a, int b) {
        long num1 = a;
        long num2 = b;
        long temp;
        long left = 2;
        long right = (long)1e14;
        long mod = (long)1e9 + 7;
        
        while (num2 > 0) {
            temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        while (left < right) {
            long middle = (left + right) / 2;
            if ((middle / a) + (middle / b) - (middle / (a * b / num1)) < n) {
                left = middle + 1;
            }
            else {
                right = middle;
            }
        }
        return (int)(left % mod);
    }
}
