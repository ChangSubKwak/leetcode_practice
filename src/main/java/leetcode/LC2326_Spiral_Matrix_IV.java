package leetcode;

public class LC2326_Spiral_Matrix_IV {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = -1;
            }
        }

        ListNode temp = head;
        int[][] direction = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int directionIndex = 0;
        int yIncrement = direction[directionIndex][1];
        int xIncrement = direction[directionIndex][0];
        int y = 0;
        int x = 0;

        while (temp != null) {
            result[y][x] = temp.val;
            temp = temp.next;

            y += yIncrement;
            x += xIncrement;

            if (y < 0 || x < 0 || y >= m || x >= n || result[y][x] != -1) {
                y -= yIncrement;
                x -= xIncrement;

                directionIndex++;
                directionIndex %= 4;

                yIncrement = direction[directionIndex][1];
                xIncrement = direction[directionIndex][0];

                y += yIncrement;
                x += xIncrement;
            }
        }

        return result;
    }
}
