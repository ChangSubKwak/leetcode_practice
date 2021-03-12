package main.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0057_InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
    	Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
    	
    	int len = intervals.length;
		int nis = newInterval[0];
		int nie = newInterval[1];

    	List<int[]> list = new ArrayList<>();
    	for (int i = 0 ; i < len ; i++) {
    		int is = intervals[i][0];
    		int ie = intervals[i][1];
    		
    		if (nis <= is && ie <= nie) {
    			continue; 
    		} else if (is <= nis && nie <= ie) {
    			list.clear();
    			for (int j = 0 ; j < len ; j++)
    				list.add(intervals[j]);
    			return list.toArray(new int[list.size()][]);
    		} else if (is <= nis && nis <= ie) {
    			nis = is;
    		} else if (is <= nie && nie <= ie) {
    			nie = ie;
    		} else {
    			list.add(intervals[i]);
    		}
    	}
    	list.add(new int[] {nis, nie});
    	
        //return list.toArray(new int[list.size()][]);
    	int[][] res = list.toArray(new int[list.size()][]);
    	Arrays.sort(res, (i1, i2) -> Integer.compare(i1[0], i2[0]));
    	return res;
    }
	
	public static void main(String[] args) {
		LC0057_InsertInterval t = new LC0057_InsertInterval();
//		System.out.println(Arrays.deepToString(t.insert(new int[][] {{1,3},{6,9}}, new int[]{2, 5})));
//		System.out.println(Arrays.deepToString(t.insert(new int[][] {{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4, 8})));
//		System.out.println(Arrays.deepToString(t.insert(new int[][] {}, new int[]{5, 7})));
//		System.out.println(Arrays.deepToString(t.insert(new int[][] {{1,5}}, new int[]{2, 3})));
//		System.out.println(Arrays.deepToString(t.insert(new int[][] {{1,5}}, new int[]{2, 7})));
		System.out.println(Arrays.deepToString(t.insert(new int[][] {{0,2},{3,9}}, new int[]{6,8})));
	}
}
