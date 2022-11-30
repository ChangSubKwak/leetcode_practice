package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC1207_Unique_Number_of_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> occurrences = new HashSet<>();
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            if (occurrences.contains(e.getValue())) {
                return false;
            }
            occurrences.add(e.getValue());
        }

        return true;
    }
}
