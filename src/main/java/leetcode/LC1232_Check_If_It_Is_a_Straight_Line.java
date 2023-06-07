package leetcode;

public class LC1232_Check_If_It_Is_a_Straight_Line {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }

        double firstGradient = Double.MAX_VALUE;
        if (coordinates[0][0] - coordinates[1][0] != 0) {
            firstGradient = (double)(coordinates[0][1] - coordinates[1][1]) / (double)(coordinates[0][0] - coordinates[1][0]);
        }

        for (int i = 2; i < coordinates.length; i++) {
            double dx = coordinates[i][0] - coordinates[i - 1][0];
            double dy = coordinates[i][1] - coordinates[i - 1][1];

            double gradient = Double.MAX_VALUE;
            if (dx != 0) {
                gradient = dy / dx;
            }

            if (Math.abs(firstGradient - gradient) > 0.001) {
                return false;
            }
        }

        return true;
    }
}
