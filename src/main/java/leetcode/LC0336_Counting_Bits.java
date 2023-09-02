package leetcode;

public class LC0336_Counting_Bits {
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];
        if (n == 0) {
            return new int[]{0};
        }

        if (n == 1) {
            return new int[]{0, 1};
        }

        answer[0] = 0;
        answer[1] = 1;

        int logNum = (int)(Math.log(n) / Math.log(2));

        for (int i = 1; i <= logNum; i++) {
            int from = (int)(Math.pow(2, i));
            int to   = (int)(Math.pow(2, i + 1)) - 1;
            for (int j = from; j <= n && j <= to; j++) {
                answer[j] = answer[j - from] + 1;
            }
        }

        return answer;
    }
}
