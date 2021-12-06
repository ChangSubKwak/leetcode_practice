package leetcode;

public class LC1217_Minimum_Cost_to_Move_Chips_to_The_Same_Position {
    public int minCostToMoveChips(int[] position) {
        int oddNum = 0;
        int evenNum = 0;
        
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                evenNum++;
            }
            
            if (position[i] % 2 == 1) {
                oddNum++;
            }
        }
        
        int min = oddNum < evenNum ? oddNum : evenNum;
        return min;
    }
}
