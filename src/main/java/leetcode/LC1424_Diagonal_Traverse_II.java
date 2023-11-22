package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC1424_Diagonal_Traverse_II {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer, List<Integer>> groups = new HashMap();
        
        int diagonalCount = 0;
        for (int row = nums.size() - 1; row >= 0; row--) {
            for (int col = 0; col < nums.get(row).size(); col++) {
                int diagonal = row + col;
                if (!groups.containsKey(diagonal)) {
                    groups.put(diagonal, new ArrayList<>());
                }
                
                groups.get(diagonal).add(nums.get(row).get(col));
                diagonalCount++;
            }
        }
        
        int[] answer = new int[diagonalCount];
        int i = 0;
        int currentDiagonalIndex = 0;
        
        while (groups.containsKey(currentDiagonalIndex)) {
            for (int num : groups.get(currentDiagonalIndex)) {
                answer[i] = num;
                i++;
            }
            
            currentDiagonalIndex++;
        }
        
        return answer;
    }
}
