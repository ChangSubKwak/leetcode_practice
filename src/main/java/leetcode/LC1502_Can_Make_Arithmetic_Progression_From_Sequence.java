package leetcode;

import java.util.*;

public class LC1502_Can_Make_Arithmetic_Progression_From_Sequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if ((arr[i] - arr[i - 1]) != difference) {
                return false;
            }
        }
        return true;
    }
}
