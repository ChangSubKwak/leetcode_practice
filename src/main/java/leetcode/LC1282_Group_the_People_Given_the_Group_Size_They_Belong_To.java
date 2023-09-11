package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC1282_Group_the_People_Given_the_Group_Size_They_Belong_To {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> list = new ArrayList<>();
            if (map.containsKey(groupSizes[i])) {
                list = map.get(groupSizes[i]);
            }
            list.add(i);
            map.put(groupSizes[i], list);
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int key   = entry.getKey();
            List<Integer> value = entry.getValue();

            int j = 1;
            List<Integer> part = new ArrayList<>();
            while (j <= value.size()) {
                part.add(value.get(j - 1));
                if (j % key == 0) {
                    result.add(part);
                    part = new ArrayList<>();
                }
                j++;
            }
        }

        return result;
    }
}
