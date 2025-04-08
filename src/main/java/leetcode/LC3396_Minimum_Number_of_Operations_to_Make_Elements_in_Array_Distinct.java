package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class LC3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct {
    public int minimumOperations(int[] nums) {
        int count = 0;

        Map<Integer, Integer> countMap = new HashMap<>();
        Queue<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        while (true) {
            boolean isDistinct = true;
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() >= 2) {
                    isDistinct = false;
                    break;
                }
            }

            if (!isDistinct) {
                for (int i = 0; i < 3 && !list.isEmpty(); i++) {
                    int value = list.poll();
                    countMap.put(value, countMap.get(value) - 1);
                    if (countMap.get(value) == 0) {
                        countMap.remove(value);
                    }
                }
                count++;
                continue;
            }
            break;
        }


        return count;
    }
}
