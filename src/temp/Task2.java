package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public int[] mostCompetitive(int[] nums, int k) {
    	List<Integer> list = new ArrayList<>();
    	
    	int len = nums.length;
    	int min = nums[0];
    	int minIdx = 0;
    	int start = 0;
    	
    	int[] minIdxArr = new int[len];
    	for (int i = 0 ; i < len ; i++) {
    		if (min > nums[i]) {
    			min = nums[i];
    			minIdx = i;
    		}
    		minIdxArr[i] = minIdx;
    	}

    	while(k > 0) {
//	    	for (int i = start ; i < len ; i++) {
//	    		if (min > nums[i]) {
//	    			min = nums[i];
//	    			minIdx = i;
//	    		}
//	    	}
	    	
	    	if (k > len - minIdx) {
	    		for (int i = minIdx ; i < len ; i++)
	    			list.add(i);
	    		k -= (len - minIdx);
	    		
	    		len = minIdx;
	    		min = nums[start];
	    		minIdx = start;
	    		
	    	} else {
	    		list.add(minIdx);
	    		k--;
	    		if (k > 0) {
		    		start = minIdx + 1;
		    		min = nums[start];
		    		minIdx = start;
	    		}
	    	}
    	}
    	
    	Collections.sort(list);
    	int[] res = new int[list.size()];
    	for (int i = 0 ; i < list.size() ; i++)
    		res[i] = nums[list.get(i)];
    	
    	return res;
    }
	
	public static void main(String[] args) {
		Task2 t = new Task2();
		int[] test = new int[50000];
		System.out.println(Arrays.toString(t.mostCompetitive(test, 50000)));
		System.out.println(Arrays.toString(t.mostCompetitive(new int[] {84,10,71,23,66,61,62,64,34,41,80,25,91,43,4,75,65,13,37,41,46,90,55,8,85,61,95,71}, 24)));
		System.out.println(Arrays.toString(t.mostCompetitive(new int[] {71,18,52,29,55,73,24,42,66,8,80,2}, 3)));
		System.out.println(Arrays.toString(t.mostCompetitive(new int[] {3,5,2,6}, 2)));
		System.out.println(Arrays.toString(t.mostCompetitive(new int[] {2,4,3,3,5,4,9,6}, 4)));
	}
}
