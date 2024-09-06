package leetcode;

public class LC2028_Find_Missing_Observations {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int length = m + n;
        int rollsTotal = 0;
        for (int num: rolls) {
            rollsTotal += num;
        }

        int remainTotal = length * mean - rollsTotal;
        int remainAverage = remainTotal / n;
        int finalRemain = remainTotal - remainAverage * n;
        int[] result = new int[n];
        int resultIndex = 0;

        if (remainTotal > 6 * n || remainAverage <= 0) {
            return new int[]{};
        }

        while (resultIndex < n) {
            result[resultIndex] = remainAverage;
            resultIndex++;
        }

        for (int i = 0; i < n; i++) {
            int difference = Math.min(finalRemain, (6 - result[i]));
            result[i] = result[i] + difference;
            finalRemain -= difference;

            if (finalRemain <= 0) {
                break;
            }
        }

        return result;
    }
}
