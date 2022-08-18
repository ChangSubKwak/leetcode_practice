package leetcode;

import java.util.*;

public class LC1338_Reduce_Array_Size_to_The_Half {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> numCount = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            numCount.put(arr[i], numCount.getOrDefault(arr[i], 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        for (Integer key : numCount.keySet()) {
            list.add(numCount.get(key));
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        int index = 0;
        int count = 0;
        while(count * 2 < arr.length) {
            count += list.get(index);
            index++;
        }
        
        return index;
    }
}
