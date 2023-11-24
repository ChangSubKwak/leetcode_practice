package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC2391_Minimum_Amount_of_Time_to_Collect_Garbage {
    public int garbageCollection(String[] garbage, int[] travel) {
        boolean[] isExist = new boolean[3];
        int[] start = new int[3];
        int[] end = new int[]{-1, -1, -1};
        int[][] garbageCount = new int[garbage.length][3];
        Map<Character, Integer> charIndex = new HashMap<>() {{
            put('M', 0);
            put('P', 1);
            put('G', 2);
        }};

        for (int i = 0; i < garbage.length; i++) {
            for (int j = 0; j < garbage[i].length(); j++) {
                char c = garbage[i].charAt(j);
                int index = charIndex.get(c);
                garbageCount[i][index]++;

                if (!isExist[index]) {
                    isExist[index] = true;
                    start[index] = i;
                }
                end[index] = i;
            }
        }

        int cost = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= end[i]; j++) {
                cost += garbageCount[j][i] + (j == end[i] ? 0 : travel[j]);
            }
        }

        return cost;
    }
}
