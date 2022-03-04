package leetcode;

public class LC0799_Champagne_Tower_X {
	public double champagneTower(int poured, int query_row, int query_glass) {
		double [][] champagneTower = new double[102][102];
		champagneTower[0][0] = (double) poured;
		
		for (int y = 0; y <= query_row; y++) {
			for (int x = 0; x <= y; x++) {
				double remainedFlow = (champagneTower[y][x] - 1.0) / 2.0;
				if (remainedFlow > 0) {
					champagneTower[y + 1][x]     += remainedFlow;
					champagneTower[y + 1][x + 1] += remainedFlow;
				}
			}
		}
		
		return Math.min(1, champagneTower[query_row][query_glass]);
	}
}
