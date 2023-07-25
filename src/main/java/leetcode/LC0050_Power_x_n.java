package leetcode;

public class LC0050_Power_x_n {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n < 0) {
            x = 1 / x;
            double powValue = Math.round(myPow(x * x, -(n / 2)) * 1e5) / 1e5;
            if (n % 2 == 0) {
                return powValue;
            }
            return Math.round(x * powValue * 1e5) / 1e5;
        }
        
        double powValue = Math.round(myPow(x * x, n / 2) * 1e5) / 1e5;
        if (n % 2 == 0) {
            return powValue;
        }
        return Math.round(x * powValue * 1e5) / 1e5;
    }
}
