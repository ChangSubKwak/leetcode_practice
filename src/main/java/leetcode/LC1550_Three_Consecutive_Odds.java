package leetcode;

public class LC1550_Three_Consecutive_Odds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 2; i++) {
            int first  = arr[i];
            int second = arr[i + 1];
            int third  = arr[i + 2];

            if (first % 2 == 1 && second % 2 == 1 && third % 2 == 1) {
                return true;
            }
        }

        return false;
    }
}
