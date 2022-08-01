package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0860_Lemonade_Change {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> billMap = new HashMap<>();
        billMap.put(5, 0);
        billMap.put(10, 0);
        billMap.put(20, 0);
    
        for (int  bill: bills) {
            if (bill == 5) {
                billMap.put(5, billMap.get(5) + 1);
                continue;
            }
        
            if (bill == 10) {
                if (billMap.get(5) <= 0) {
                    return false;
                }
                billMap.put(10, billMap.get(10) + 1);
                billMap.put(5, billMap.get(5) - 1);
                continue;
            }
        
            if (billMap.get(5) >= 1 && billMap.get(10) >= 1) {
                billMap.put(20, billMap.get(20) + 1);
                billMap.put(10, billMap.get(10) - 1);
                billMap.put(5, billMap.get(5) - 1);
                continue;
            }
        
            if (billMap.get(5) >= 3) {
                billMap.put(20, billMap.get(20) + 1);
                billMap.put(5, billMap.get(5) - 3);
                continue;
            }
        
            return false;
        }
    
        return true;
    }
}
