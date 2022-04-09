package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LC0703_Kth_Largest_Element_in_a_Stream {
	class KthLargest {
	    private List<Integer> list;
	    private int k;
		
	    public KthLargest(int k, int[] nums) {
	        list = Arrays.stream(nums)
	        	.boxed()
	            .collect(Collectors.toList());
            this.k = k;
	    }
	    
	    public int add(int val) {
	        list.add(val);
	        Collections.sort(list);
	        return list.get(list.size() - k);
	    }
	}
}
