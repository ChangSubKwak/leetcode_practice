package leetcode;

public class LC0263_Ugly_Number {
    public boolean isUgly(int n) {
        if (n < 1) {
            return false;
        }

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                continue;
            }

            if (n % 3 == 0) {
                n /= 3;
                continue;
            }

            if (n % 5 == 0) {
                n /= 5;
                continue;
            }
            return false;
        }

        return true;
    }
}
