package leetcode;

import java.util.List;
import java.util.stream.Collectors;

public class LC0989_Add_to_Array_Form_of_Integer {
    public List<Integer> addToArrayForm(int[] num, int k) {

        int i = num.length - 1;
        int j = 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || k > 0) {
            int num1 = 0;
            if (i >= 0) {
                num1 = num[i];
                i--;
            }

            int num2 = 0;
            if (k > 0) {
                num2 = (k % (int)Math.pow(10, j) ) / (int)Math.pow(10, j - 1);
                k -= num2 * (int)Math.pow(10, j - 1);
                j++;
            }

            result.append((num1 + num2 + carry) % 10);
            if (num1 + num2 + carry >= 10) {
                carry = 1;
            } else {
                carry = 0;
            }

        }

        if (carry == 1) {
            result.append(1);
        }

        result.reverse();

        return result.toString()
            .chars()
            .mapToObj(c -> Integer.valueOf(c - '0'))
            .collect(Collectors.toList());
    }
}
