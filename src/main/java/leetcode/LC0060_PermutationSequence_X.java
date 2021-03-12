package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0060_PermutationSequence_X {
    public String getPermutation(int n, int k) {
    	List<Integer> numbers = new ArrayList<>();
    	int[] factorial = new int[n+1];
    	StringBuilder sb = new StringBuilder();
    	
    	int sum = 1;
    	factorial[0] = 1;
    	for(int i=1; i<=n; i++) {
    		sum *= i;
    		factorial[i] = sum;
    	}
    	
    	for (int i = 1 ; i <= n ; i++) numbers.add(i);
    	k--;
    	
    	for (int i = 1 ; i <= n ; i++) {
    		int index = k / factorial[n - i];
    		sb.append(String.valueOf(numbers.get(index)));
    		numbers.remove(index);
    		k -= index*factorial[n-i];
    	}
    	
    	return sb.toString();
    }
	
	public static void main(String[] args) {
		LC0060_PermutationSequence_X t = new LC0060_PermutationSequence_X();
		//System.out.println(t.getPermutation(3, 3));
		System.out.println(t.getPermutation(4, 9));
	}
}
