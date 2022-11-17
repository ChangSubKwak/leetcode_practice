package leetcode;

public class LC0223_Rectangle_Area {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);
        int area3 = 0;

        int width, height;

        if (bx1 <= ax1 && bx2 <= ax1) {
            return area1 + area2;
        }

        if (ax2 <= bx1) {
            return area1 + area2;
        }

        if (by1 <= ay1 && by2 <= ay1) {
            return area1 + area2;
        }

        if (ay2 <= by1) {
            return area1 + area2;
        }

        width  = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        height = Math.min(ay2, by2) - Math.max(ay1, by1);
        area3 = Math.max(0, width * height);

        return area1 + area2 - area3;
    }
}
