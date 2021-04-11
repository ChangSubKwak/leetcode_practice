package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0120_Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[] dp = new int[size];
        for (int i = 0 ; i < triangle.get(size - 1).size() ; i++)
        	dp[i] = triangle.get(size - 1).get(i);
        
        for (int y = size - 2 ; y >= 0 ; y--) {
        	for (int x = 0 ; x < triangle.get(y).size() ; x++) {
        		dp[x] = Math.min(triangle.get(y).get(x) + dp[x], triangle.get(y).get(x) + dp[x+1]);
        	}
//        	System.out.println(Arrays.toString(dp));
        }
        
        //return Arrays.stream(dp).min().getAsInt();
        return dp[0];
    }
	
	public static void main(String[] args) {
		LC0120_Triangle t = new LC0120_Triangle();
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		temp.add(2);	list.add(new ArrayList<>(temp));
		temp.clear();	temp.add(3);	temp.add(4);	list.add(new ArrayList<>(temp));
		temp.clear();	temp.add(6);	temp.add(5);	temp.add(7);	list.add(new ArrayList<>(temp));
		temp.clear();	temp.add(4);	temp.add(1);	temp.add(8);	temp.add(3);	list.add(new ArrayList<>(temp));
		
		System.out.println(list);
		System.out.println(t.minimumTotal(list));
	}
}
