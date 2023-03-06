package leetcode;

public class LC1539_Kth_Missing_Positive_Number {
    public int findKthPositive(int[] arr, int k) {
        int i = 1;
        int j = 0;
        int num = 1;
        for (i = 1; i <= 1000; i++) {
            if (k == 0 || j >= arr.length) {
                break;
            }

            if (arr[j] == i) {
                j++;
                continue;
            }

            k--;
        }

        return i + k - 1;
    }
}
