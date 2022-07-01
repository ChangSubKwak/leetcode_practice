package leetcode;

import java.util.Arrays;

public class LC1710_Maximum_Units_on_a_Truck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> (b[1] - a[1]));
        System.out.println(Arrays.deepToString(boxTypes));
        
        int index = 0;
        int unitSum = 0;
        while(index < boxTypes.length && truckSize > 0) {
            int diff = truckSize - boxTypes[index][0] < 0 ? truckSize : boxTypes[index][0];
            unitSum += boxTypes[index][1] * diff;
            truckSize -= diff;
            index++;
        }
        return unitSum;
    }
}
