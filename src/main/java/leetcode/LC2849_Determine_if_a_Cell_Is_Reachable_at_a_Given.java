package leetcode;

public class LC2849_Determine_if_a_Cell_Is_Reachable_at_a_Given {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int width  = Math.abs(fx - sx);
        int height = Math.abs(fy - sy);
        int max = width + height;
        int min = max - Math.min(width, height);
        
        if (width == 0 && height == 0) {
            if (fx == sx && fy == sy && fx == fy && t != 1) {
                return true;
            }
            
            if (t != 1) {
                return true;
            }
            return false;
        }
        
        return min <= t;
    }
}
