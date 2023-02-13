package leetcode;

public class LC1523_Count_Odd_Numbers_in_an_Interval_Range {
    public int countOdds(int low, int high) {
        int diff = high - low + 1;
        int count = 0;

        if (low % 2 == 1) {
            diff++;
        }

        count += (diff / 2);

        return count;
    }
}
