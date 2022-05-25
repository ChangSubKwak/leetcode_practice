package leetcode;

import java.util.Arrays;

public class LC0354_Russian_Doll_Envelopes_X {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        
        int[] tops = new int[envelopes.length];
        int sizeOfTops = 0;
        
        for (int[] envelope : envelopes) {
            int colSize = envelope[1];
            int insertIndex = Arrays.binarySearch(tops, 0, sizeOfTops, colSize);
            
            System.out.println("colSize : " + colSize + ", insertIndex : " + insertIndex + ", tops : " + Arrays.toString(tops));
            if (insertIndex < 0) {
                insertIndex = -(insertIndex + 1);
            }
            
            tops[insertIndex] = colSize;
            if (insertIndex == sizeOfTops) {
                sizeOfTops++;
            }
        }
        return sizeOfTops;
    }
}
