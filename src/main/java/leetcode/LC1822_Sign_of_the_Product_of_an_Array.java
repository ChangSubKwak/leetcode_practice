package leetcode;

public class LC1822_Sign_of_the_Product_of_an_Array {
    public int arraySign(int[] nums) {
        int sum = 1;
        for (int num : nums) {
            if (num <= -1) {
                sum *= -1;
            }

            if (num == 0) {
                return 0;
            }
        }

        return sum;
    }
}
