package leetcode;

public class LC1716_Calculate_Money_in_Leetcode_Bank {
    public int totalMoney(int n) {
        int start = 1, i = 0, total = 0;

        while (i < n) {
            total += start;
            i += 1;
            start += 1;

            if (i % 7 == 0) {
                start = i / 7 + 1;
            }
        }

        return total;
    }
}
