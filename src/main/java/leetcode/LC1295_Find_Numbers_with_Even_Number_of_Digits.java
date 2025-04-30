package leetcode;

public class LC1295_Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            String numString = String.valueOf(num);

            if (numString.length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
