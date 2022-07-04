package leetcode;

import java.util.*;

public class LC1465_Maximum_Area_of_a_Piece_of_Cake_After_Horizontal_and_Vertical_Cuts {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        long[] heightDiff = new long[horizontalCuts.length + 1];
        long[] widthDiff = new long[verticalCuts.length + 1];

        for (int i = 0; i <= horizontalCuts.length; i++) {
            if (i == 0) {
                heightDiff[i] = horizontalCuts[i];
                continue;
            }
            if (i == horizontalCuts.length) {
                heightDiff[i] = h - horizontalCuts[i - 1];
                continue;
            }
            heightDiff[i] = horizontalCuts[i] - horizontalCuts[i - 1];
        }

        for (int i = 0; i <= verticalCuts.length; i++) {
            if (i == 0) {
                widthDiff[i] = verticalCuts[i];
                continue;
            }
            if (i == verticalCuts.length) {
                widthDiff[i] = w - verticalCuts[i - 1];
                continue;
            }
            widthDiff[i] = verticalCuts[i] - verticalCuts[i - 1];
        }

        heightDiff = Arrays.stream(heightDiff).boxed().sorted(Collections.reverseOrder()).mapToLong(Long::longValue).toArray();
        widthDiff = Arrays.stream(widthDiff).boxed().sorted(Collections.reverseOrder()).mapToLong(Long::longValue).toArray();

        long result = (heightDiff[0] * widthDiff[0]) % 1000_000_007;

        return (int)result;
    }
}
