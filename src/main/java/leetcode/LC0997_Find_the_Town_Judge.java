package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC0997_Find_the_Town_Judge {
    public int findJudge(int n, int[][] trust) {
        if (n ==1 && trust.length == 0) {
            return 1;
        }
    
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
    
        for (int i = 1; i <= n; i++) {
            set.add(i);
        }
    
        for (int i = 0; i < trust.length; i++) {
            set.remove(trust[i][0]);
            map.put(trust[i][1], map.getOrDefault(trust[i][1], 0) + 1);
        }
    
        if (set.size() != 1) {
            return -1;
        }
    
        int candidate = set.iterator().next();
        int trusted = map.get(candidate);
    
        return trusted == n - 1 ? candidate : -1;
    }
}
