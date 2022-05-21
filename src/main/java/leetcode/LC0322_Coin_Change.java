package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0322_Coin_Change {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < coins.length; i++) {
            countMap.put(coins[i], 1);
        }
        
        int i = 1;
        while(i <= amount) {
            for (int j = 0; j < coins.length; j++) {
                boolean isExistKey = countMap.containsKey(i - coins[j]);
                if (isExistKey) {
                    if (countMap.containsKey(i)) {
                        countMap.put(i, Math.min(countMap.get(i), countMap.get(i - coins[j]) + 1));    
                    } else {
                        countMap.put(i, countMap.get(i - coins[j]) + 1);
                    }
                    
                }
            }
            i++;
        }
        return countMap.containsKey(amount) ? countMap.get(amount) : -1;
    }
}
