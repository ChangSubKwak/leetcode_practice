package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LC0057_Insert_Interval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0, length = intervals.length;

        while (i < length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i++]);
        }

        while (i < length && intervals[i][0] <= newInterval[1]) {
            newInterval = new int[] {Math.min(intervals[i][0], newInterval[0]), Math.max(intervals[i][1], newInterval[1])};
            i++;
        }

        result.add(newInterval);

        while (i < length) {
            result.add(intervals[i++]);
        }

        return result.toArray(new int[result.size()][2]);
    }
    public int[][] insert_V1(int[][] intervals, int[] newInterval) {
        int index1 = -1, index2 = -1;

        List<int[]> intervalsList = new ArrayList<>();
        for (int[] interval : intervals) {
            intervalsList.addAll(Arrays.asList(interval));
        }

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= newInterval[0] && newInterval[0] <= intervals[i][1]) {
                index1 = i;
            }

            if (intervals[i][0] <= newInterval[1] && newInterval[1] <= intervals[i][1]) {
                index2 = i;
            }
        }

        if (intervals.length == 0) {
            return new int[][]{{newInterval[0], newInterval[1]}};
        }

        // not overlapped
        if (index1 == -1 && index2 == -1) {
            int index = 0;
            while (intervalsList.size() > 0 && index < intervalsList.size()) {
                if (newInterval[0] <= intervalsList.get(index)[0] && intervalsList.get(index)[1] <= newInterval[1]) {
                    intervalsList.remove(index);
                    continue;
                }
                index++;
            }

            intervalsList.add(newInterval);
        }
        else if (index1 == -1) {
            int[] interval = new int[] { intervalsList.get(index2)[0], intervalsList.get(index2)[1] };
            interval[0] = newInterval[0];

            int i = index2;
            while (i >= 0 && newInterval[0] < intervalsList.get(i)[0]) {
                intervalsList.remove(i);
                i--;
            }

            intervalsList.add(i + 1, interval);
        }
        else if (index2 == -1) {
            int[] interval = new int[] { intervalsList.get(index1)[0], intervalsList.get(index1)[1] };
            interval[1] = newInterval[1];

            int i = index1;
            while (i < intervalsList.size() && intervalsList.get(i)[1] < newInterval[1]) {
                intervalsList.remove(i);
            }

            intervalsList.add(index1, interval);
        } else {
            int[] interval1 = intervalsList.get(index1);
            int[] interval2 = intervalsList.get(index2);
            int count = index2 - index1 + 1;

            for (int i = 0; i < count; i++) {
                intervalsList.remove(index1);
            }
            intervalsList.add(new int[]{interval1[0], interval2[1]});
        }

        Collections.sort(intervalsList, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            }
            return e1[0] - e2[0];
        });

        return intervalsList.stream()
            .map(i -> Arrays.stream(i).toArray())
            .toArray(int[][]::new);

    }
}
