package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0338_Counting_Bits {
    public int[] countBits(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        
        if (n == 0) {
            return list.subList(0, n + 1).stream().mapToInt(i -> i).toArray();
        }
        
        int length = (int)(Math.log(n)/Math.log(2)) + 1;
        for (int i = 1; i < length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                temp.add(list.get(j) + 1);
            }
            list.addAll(temp);
        }
        return list.subList(0, n + 1).stream().mapToInt(i -> i).toArray();
    }
}
