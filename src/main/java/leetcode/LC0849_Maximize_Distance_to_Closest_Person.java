package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC0849_Maximize_Distance_to_Closest_Person {
    public int maxDistToClosest(int[] seats) {
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                pos.add(i);
            }
        }
        
        List<Integer> distance = new ArrayList<>();
        for (int i = 1; i < pos.size(); i++) {
            distance.add(pos.get(i) - pos.get(i-1));
        }
                
        if (pos.size() == 1) {
            int val1 = pos.get(0);
            int val2 = seats.length - pos.get(0) - 1;
            
            return val1 > val2 ? val1 : val2;
        }
        
        int max1 = Collections.max(distance) / 2;
        int max2 = pos.get(0);
        int max3 = seats.length - pos.get(pos.size() - 1) - 1;
        
        return Math.max(Math.max(max1, max2), max3);
    }
}
