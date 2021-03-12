package main.java.leetcode;

/*
class LC0016_Data implements Comparable<LC0016_Data>{
	public int org;
	public int abs;
	public int idx;
	
	@Override
	public int compareTo(LC0016_Data in) {
		if (this.abs > in.abs) return 1;
		else if (this.abs < in.abs) return -1;
		else return 0;
	}

	@Override
	public String toString() {
		return "LC0016_Data [org=" + org + ", abs=" + abs + ", idx=" + idx + "]";
	}
}
*/

public class LC0016_3SumCloset {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        
        int sum = nums[0] + nums[1] + nums[2];
        for (int i = 0 ; i < len ; i++) {
        	for (int j = i+1 ; j < len ; j++) {
        		for (int k = j+1 ; k < len ; k++) {
        			int temp = nums[i] + nums[j] + nums[k]; 
        			int diff1 = Math.abs(sum - target);
        			int diff2 = Math.abs(temp - target);
        			
        			if (diff1 > diff2)
        				sum = temp;
        		}
        	}
        }

        return sum;
    }
	
	public static void main(String[] args) {
		LC0016_3SumCloset lc = new LC0016_3SumCloset();
		
		System.out.println(lc.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
		System.out.println(lc.threeSumClosest(new int[]{ 0, 2, 1, -3}, 1));
	}
}
