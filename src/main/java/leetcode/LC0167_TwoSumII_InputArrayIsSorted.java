package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LC0167_TwoSumII_InputArrayIsSorted {
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
	
    public int[] twoSum(int[] numbers, int target) {
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
    	
    	return list.stream().mapToInt(Integer::new).toArray();
    }
    
	public static void main(String[] args) {
		LC0167_TwoSumII_InputArrayIsSorted t = new LC0167_TwoSumII_InputArrayIsSorted();
//		System.out.println(Arrays.toString(t.twoSum(new int[] {2, 7, 11, 15}, 9)));
//		System.out.println(Arrays.toString(t.twoSum(new int[] {2, 3, 4}, 6)));
//		System.out.println(Arrays.toString(t.twoSum(new int[] {-1, 0}, -1)));
//		System.out.println(Arrays.toString(t.twoSum(new int[] {0, 0, 3, 4}, 0)));
		System.out.println(Arrays.toString(t.twoSum(new int[] {5, 25, 75}, 100)));
	}
}
