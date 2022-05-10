package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0216_Combination_Sum_III_X {
    List<List<Integer>> result = new ArrayList<>();                     
    List<Integer> combination = new ArrayList<>();                              
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        recursive(k, n, 1);                                              
        return result;
    }
    
    private void recursive(int k, int n, int start) {                      
        if (k == 0 && n == 0) {                                             
            result.add(new ArrayList<>(combination));
            return;
        }
        
        for (int i = start; i < 10; i++){
            if (k > 0 && n >= 0) {
                combination.add(i);
                recursive(k - 1, n - i, i + 1);
                combination.remove(combination.size() - 1);
            }
        }
    }
}
