package leetcode;

public class LC0149_Max_Points_on_a_Line {
    public int maxPoints(int[][] points) {
        int max = 1;
        
        for (int i = 0; i < points.length - 1; i++) {
            int x1;
            int y1;
            
            x1 = points[i][0];
            y1 = points[i][1];
            
            for (int j = i + 1; j < points.length; j++) {
                int x2;
                int y2;
            
                x2 = points[j][0];
                y2 = points[j][1];
                
                int count = 0;
                for (int k = 0; k < points.length; k++) {
                    int x = points[k][0];
                    int y = points[k][1];
                    int f = (y1 - y2) * (x - x1) - (y - y1) * (x1 - x2);
                    
                    if (x1 == x2) {
                        f = x - x1;
                    }
                    
                    if (y1 == y2) {
                        f = y - y1;
                    }
                    
                    if (f == 0) {
                        count++;
                    }
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
