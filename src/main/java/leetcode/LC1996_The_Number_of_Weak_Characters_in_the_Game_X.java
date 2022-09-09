package leetcode;

import java.util.*;

public class LC1996_The_Number_of_Weak_Characters_in_the_Game_X {
    public int numberOfWeakCharacters(int[][] properties) {
        int length = properties.length;
        int count = 0;

        Arrays.sort(properties, (a, b) -> b[0] != a[0] ? b[0] - a[0] : a[1] - b[1]);
        System.out.println("Arrays.deepToString(properties) = " + Arrays.deepToString(properties));

        int max = 0;
        for (int i = 0; i < length; i++) {
            if (properties[i][1] < max) {
                count++;
            }
            max = Math.max(max, properties[i][1]);
        }

        return count;
    }
}
