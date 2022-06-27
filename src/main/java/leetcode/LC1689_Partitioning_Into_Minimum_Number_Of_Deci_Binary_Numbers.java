package leetcode;

public class LC1689_Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers {
    public int minPartitions(String n) {
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            max = Math.max(max, n.charAt(i) - '0');
        }
        return max;
    }
}
