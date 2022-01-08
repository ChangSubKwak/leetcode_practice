package leetcode;

public class LC1094_Car_Pooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int len = trips.length;
        for(int i = 0; i <= 1000; i++) {
            int total = 0;
            for(int j = 0; j < len; j++) {
                int fr = trips[j][1];
                int to = trips[j][2];
                if (fr <= i && i < to) {
                    total += trips[j][0];
                }
            }
            if (total > capacity) {
                return false;
            }
        }
        return true;
    }
}