package leetcode;

public class LC2305_Fair_Distribution_of_Cookies {
    private int recur(int[] cookies, int start, int k, int[] values, int min) {
        if (start == cookies.length) {
            int max = 0;
            for (int value : values) {
                max = Math.max(max, value);
            }
            return Math.min(min, max);
        }

        for (int i = 0; i < k; i++) {
            values[i] += cookies[start];
            min = recur(cookies, start + 1, k, values, min);
            values[i] -= cookies[start];
        }
        return min;
    }

    public int distributeCookies(int[] cookies, int k) {
        return recur(cookies, 0, k, new int[k], Integer.MAX_VALUE);
    }
}
