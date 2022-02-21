package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1286_Remove_Covered_Intervals {
    public int removeCoveredIntervals(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++) {
            list.add(Arrays.asList(intervals[i][0], intervals[i][1]));
        }
        System.out.println(list);
        
        while(true) {
            boolean isFinish = false;
            outer: for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (i == j) {
                        continue;
                    }
                    int a = list.get(i).get(0);
                    int b = list.get(i).get(1);
                    int c = list.get(j).get(0);
                    int d = list.get(j).get(1);

                    if (c <= a && b <= d) {
                        list.remove(i);
                        isFinish = true;
                        break outer;
                    }
                }
            }
            if (!isFinish) {
                break;
            }
        }
        return list.size();
    }
}
