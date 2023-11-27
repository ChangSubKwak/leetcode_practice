package leetcode;

public class LC0935_Knight_Dialer {
    public int knightDialer(int n) {
        if (n == 1) {
            return 10;
        }

        int[][] previousNumber = new int[][]{
            {4, 6}, {6, 8}, {7, 9},
            {4, 8}, {0, 3, 9}, {},
            {0, 1, 7}, {2, 6}, {1, 3},
            {2, 4}
        };

        long[] count = new long[]{2, 2, 2, 2, 3, 0, 3, 2, 2, 2};
        for (int i = 3; i <= n; i++) {
            long[] newCount = new long[10];
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k < previousNumber[j].length; k++) {
                    newCount[j] += count[previousNumber[j][k]];
                }
                newCount[j] %= 1000_000_007;
            }
            // System.out.println(Arrays.toString(newCount));
            count = newCount;
        }

        long result = 0;
        for (int i = 0; i <= 9; i++) {
            result += count[i];
            result %= 1000_000_007;
        }

        return (int)result;
    }
}
