package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LC0179_LargestNumber {
    public String largestNumber(int[] nums) {
    	List<String> list = new ArrayList<>();
    	for (int i = 0; i < nums.length; i++) {
    		list.add(String.valueOf(nums[i]));
    	}
    	Collections.sort(list, new Comparator<String>() {
    		@Override
    		public int compare(String s1, String s2) {
    			String newStr1 = s1 + s2;
    			String newStr2 = s2 + s1;
    			if (newStr1.compareTo(newStr2) > 0) {
    				return -1;
    			} else if (newStr1.compareTo(newStr2) < 0) {
    				return 1;
    			}
    			return 0;

    		}
    	});
        
        String result = String.join("", list.stream().map(Object::toString).collect(Collectors.toList()));
        if (result.charAt(0) == '0') {
            return "0";
        }
        
   		return result;
    }
    
	public static void main(String[] args) {
		LC0179_LargestNumber t = new LC0179_LargestNumber();
		System.out.println(t.largestNumber(new int[] {3, 30, 34, 5, 9})); 
	}
}
