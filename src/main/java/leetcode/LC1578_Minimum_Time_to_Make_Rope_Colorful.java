package leetcode;

public class LC1578_Minimum_Time_to_Make_Rope_Colorful {
    public int minCost(String colors, int[] neededTime) {
        int result = 0;
        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i - 1) == colors.charAt(i)) {
                result += Math.min(neededTime[i - 1], neededTime[i]);
                neededTime[i] = Math.max(neededTime[i - 1], neededTime[i]);
            }
        }
        return result;
    }
}
