package leetcode;

public class LC1304_Find_N_Unique_Integers_Sum_up_to_Zero {
    public int[] sumZero(int n) {
        int[] result = new int[n];

        if (n == 1) {
            return new int[]{0};
        }

        for (int i = 1; i <= (int)(n / 2); i++) {
            result[2 * (i - 1)] = i;
            result[2 * (i - 1) + 1] = -i;
        }

        if (n % 2 == 1) {
            result[n - 1] = 0;
        }

        return result;
    }
}
