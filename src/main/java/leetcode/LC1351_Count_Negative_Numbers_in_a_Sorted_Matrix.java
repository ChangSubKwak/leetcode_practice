package leetcode;

public class LC1351_Count_Negative_Numbers_in_a_Sorted_Matrix {
    public int countNegatives(int[][] grid) {
        int y = 0;
        int x = 0;
        int rowSize = grid.length;
        int colSize = grid[0].length;

        while (x < colSize && grid[y][x] >= 0) {
            x++;
        }

        int count = colSize - x;

        y = 1;
        while (y < rowSize) {

            while (x > 0 && grid[y][x - 1] < 0) {
                x--;
            }
            y++;
            count += (colSize - x);
        }

        return count;
    }
}
