package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC2352_Equal_Row_and_Column_Pairs {
    public int equalPairs(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        List<String> rowString = new ArrayList<>();
        List<String> colString = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            StringBuilder rowSb = new StringBuilder();
            StringBuilder colSb = new StringBuilder();
            for (int j = 0; j < col; j++) {
                rowSb.append(grid[i][j] + ",");
                colSb.append(grid[j][i] + ",");
            }
            rowString.add(rowSb.toString());
            colString.add(colSb.toString());
        }

        int count = 0;
        for (String s1 : rowString) {
            for (String s2 : colString) {
                if (s1.equals(s2)) {
                    count++;
                }
            }
        }

        return count;
    }
}
