package leetcode;

public class LC0688_Knight_Probability_in_Chessboard {
    public double knightProbability(int n, int k, int row, int column) {
        if (k == 0) {
            return 1;
        }

        double[][][] remainProbability = new double[k + 1][n][n];
        remainProbability[0][row][column] = 1.0;

        int[][] direction = {
            {-2, 1}, {-1, 2},
            { 1, 2}, { 2, 1},
            { 2,-1}, { 1,-2},
            {-1,-2}, {-2,-1}
        };

        for (int moves = 1; moves <= k; moves++) {
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < n; x++) {
                    for (int i = 0; i < direction.length; i++) {
                        int dy = direction[i][0];
                        int dx = direction[i][1];
                        int previousY = y - dy;
                        int previousX = x - dx;

                        if (previousY < 0 || previousY > n - 1 || previousX < 0 || previousX > n - 1) {
                            continue;
                        }

                        remainProbability[moves][y][x] += remainProbability[moves - 1][previousY][previousX] / 8.0;
                    }

                }
            }
        }

        double result = 0.0;
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                result += remainProbability[k][y][x];
            }
        }

        return result;
    }
}
