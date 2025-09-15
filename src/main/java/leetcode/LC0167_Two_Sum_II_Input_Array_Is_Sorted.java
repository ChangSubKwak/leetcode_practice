package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LC0167_Two_Sum_II_Input_Array_Is_Sorted {
	public int[] twoSum2(int[] numbers, int target) {
		int[] result = new int[2];
		
		outloop:
		for (int i = 0; i < numbers.length; i++) {
			int remainTarget = target - numbers[i];
			int s = i + 1;
			int e = numbers.length - 1;
			int m = 0;
			result[0] = i + 1;
			
			while (s <= e) {
				m = (s + e) / 2;
				if (remainTarget == numbers[m]) {
					result[1] = m + 1;
					break outloop;
				}
				
				if (remainTarget > numbers[m]) {
					s = m + 1;
				}
				
				if (remainTarget < numbers[m]) {
					e = m - 1;
				}
			}
		}
		
		return result;
	}
	
	public int binarySearch(int[] numbers, int target) {
	    int start = 0;
	    int end = numbers.length - 1;
	    int mid;
	    while (start <= end) {
	        mid = (start + end) / 2;
	        if (numbers[mid] < target) {
	            start = mid + 1;
	        }
	        else {
	            end = mid - 1;
	        }
	    }
	    
	    if (start >= numbers.length || numbers[start] != target) {
	    	return -1;
	    }
	 
	    return start;
	}
	
    public int[] twoSum1(int[] numbers, int target) {
    	List<Integer> list = new ArrayList<>();
    	for (int i = 0; i < numbers.length; i++) {
    		int index1 = binarySearch(numbers, numbers[i]);
    		int index2 = binarySearch(numbers, target - numbers[i]);

    		if (index1 != -1 && index2 != -1) {
    			list.add(index1);
    			list.add(index2 + (index1 == index2 ? 1 : 0) );
    			Collections.sort(list);
    			break;
    		}
    	}
    	list.set(0, list.get(0) + 1);
    	list.set(1, list.get(1) + 1);

		int[] returnValue = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			returnValue[i] = list.get(i);
		}
		return returnValue;
    }

}
