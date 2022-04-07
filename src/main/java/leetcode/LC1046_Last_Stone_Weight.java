package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LC1046_Last_Stone_Weight {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = Arrays.stream(stones)
            .boxed()
            .collect(Collectors.toList());
        
        while(list.size() > 1) {
            Collections.sort(list);
            int size = list.size();
            
            int x = list.get(size - 1);
            int y = list.get(size - 2);

            
            list.remove(list.size() - 1);
            list.remove(list.size() - 1);
            if (x == y) {
                continue;
            }
            
            list.add(Math.abs(x - y));
        }
        
        if (list.size() == 1) {
            return list.get(0);
        }
        
        return 0;
    }
}
