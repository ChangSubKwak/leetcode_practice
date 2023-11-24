package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LC1356_Sort_Integers_by_The_Number_of_1_Bits {
    public int[] sortByBits(int[] arr) {
        List<Integer> list = Arrays.stream(arr)
            .boxed()
            .collect(Collectors.toList());

        Collections.sort(list, (a, b) ->
            Integer.bitCount(a) == Integer.bitCount(b) ? a - b : Integer.bitCount(a) - Integer.bitCount(b)
        );

        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
