package leetcode;

import java.util.*;

public class LC0352_Data_Stream_as_Disjoint_Intervals {
    private static class Interval {
        public int start;
        public int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static class SummaryRanges {
        TreeMap<Integer, Interval> map;
        public SummaryRanges() {
            map = new TreeMap<>();
        }
        public void addNum(int value) {
            if (map.containsKey(value)) {
                return;
            }

            Integer lower = map.lowerKey(value);
            Integer higher = map.higherKey(value);

            if (lower != null && higher != null && map.get(lower).end + 1 == value && higher == value + 1) {
                map.get(lower).end = map.get(higher).end;
                map.remove(higher);
                return;
            }

            if (lower != null && map.get(lower).end + 1 >= value) {
                map.get(lower).end = Math.max(map.get(lower).end, value);
                return;
            }

            if (higher != null && higher == value + 1) {
                map.put(value, new Interval(value, map.get(higher).end));
                map.remove(higher);
                return;
            }

            map.put(value, new Interval(value, value));
        }

        public int[][] getIntervals() {
            return map.values()
                .stream()
                .map(e -> new int[]{e.start, e.end})
                .toArray(int[][]::new);
        }
    }
}
