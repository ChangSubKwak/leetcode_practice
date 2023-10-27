package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LC0119_Pascals_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));
        result.add(Arrays.asList(1, 1));
        
        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j <= i - 1; j++) {
                newRow.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result.get(rowIndex);
    }
}
