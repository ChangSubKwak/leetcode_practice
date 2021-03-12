package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0089_GrayCode {
    public List<Integer> grayCode(int n) {
    	List<Integer> res = new ArrayList<>();
    	if (n==0) {
    		res.add(0);
    		return res;
    	}
    	
   		res.add(0);
   		res.add(1);
    	
   		for (int i = 1 ; i < n ; i++) {
	    	int len = res.size();
	    	for (int j = len - 1 ; j >= 0 ; j--)
	    		res.add(res.get(j));
	    	
	    	for (int j = len ; j < len*2 ; j++)
	    		res.set(j, res.get(j) + (1<<i));
	    		
   		}
    	
        return res;
    }
	
	public static void main(String[] args) {
		LC0089_GrayCode t = new LC0089_GrayCode();
		System.out.println(t.grayCode(0));
		System.out.println(t.grayCode(1));
		System.out.println(t.grayCode(2));
		System.out.println(t.grayCode(3));
	}
}
