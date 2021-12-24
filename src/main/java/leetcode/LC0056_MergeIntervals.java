package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LC0056_MergeIntervals {
    public int[][] merge(int[][] intervals) {
    	int idx = 1;
    	Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	int s = intervals[0][0];
    	int e = intervals[0][1];
    	while(idx < intervals.length ) {
    		if (e >= intervals[idx][0]) {
    			e = Math.max(e, intervals[idx][1]);
   				s = Math.min(s, intervals[idx][0]);
    		} else {
    			list.add(s);
    			list.add(e);
    			s = intervals[idx][0];
    			e = intervals[idx][1];
    		}
    		idx++;
    	}
    	list.add(s);
    	list.add(e);
    	
    	int[][] res = new int[list.size()/2][2];
    	for (int i = 0 ; i < list.size() ; i+=2) {
    		res[i/2][0] = list.get(i);
    		res[i/2][1] = list.get(i+1);
    	}
        
    	return res;
    }
    
    public int[][] merge2(int[][] intervals) {
        int len = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        
        LinkedList<List<Integer>> list = new LinkedList<>();
        
        for (int i = 0; i < len; i++) {
            list.addLast(Arrays.asList(intervals[i][0], intervals[i][1]));
        }
        
        int i = 1;
        while(i < len) {
            int prevFrom = list.get(i-1).get(0);
            int prevTo = list.get(i-1).get(1);
            
            int currFrom = list.get(i).get(0);;
            int currTo = list.get(i).get(1);;

            if ((prevFrom <= currFrom) && (currFrom <= prevTo)) {
                list.remove(i-1);
                list.remove(i-1);
                list.add(i-1, Arrays.asList(prevFrom, Math.max(prevTo, currTo)));
                len--;
                continue;
            }
            i++;
        }
        
        return list.stream()
            .map(l -> l.stream().mapToInt(e -> e).toArray())
            .toArray(int[][]::new)
            ;
    }
	
	public static void main(String[] args) {
		LC0056_MergeIntervals t = new LC0056_MergeIntervals();
		System.out.println(Arrays.deepToString(t.merge(new int[][] {{1,3},{2,6},{8,10},{15,18}})));
		System.out.println(Arrays.deepToString(t.merge(new int[][] {{1,4},{4,5}})));
		System.out.println(Arrays.deepToString(t.merge(new int[][] {{1,4},{0,4}})));
		System.out.println(Arrays.deepToString(t.merge(new int[][] {{1,4},{0,1}})));
		System.out.println(Arrays.deepToString(t.merge(new int[][] {{1,4},{0,0}})));
		//System.out.println(t.merge(new int[][] {{1,3},{2,6},{8,10},{15,18}}));
		//System.out.println(t.merge(new int[][] {{1,4},{4,5}}));
	}
}
