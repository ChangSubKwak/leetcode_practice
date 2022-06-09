package leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LC0268_Missing_Number {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        HashSet<Integer> hashSet = IntStream.of(nums).boxed()
            .collect(Collectors.toCollection(HashSet::new));

        int res = 0;
        for (int i = 0; i <= length; i++) {
            if (!hashSet.contains(i)) {
                res = i;
                break;
            }
        }

        return res;
    }
}

