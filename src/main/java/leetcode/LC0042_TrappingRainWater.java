package main.java.leetcode;

public class LC0042_TrappingRainWater {
    public int trap(int[] height) {
    	int len = height.length;
    	if (len == 0) return 0;
    	
    	int sum = 0, t = 0, maxIdx = 0;
    	int max = height[0];
    	for (int i = 1 ; i < len ; i++) {
    		if (0 < height[i] && max <= height[i]) {
    			max = height[i];
    			sum += t;
    			t = 0;
    			maxIdx = i;
    		}
    		else if (max > height[i]) {
    			t += max - height[i];
    		}
    	}
    	
    	if (maxIdx != len - 1) {
	    	max = height[len - 1];
	    	t = 0;
	    	for (int i = len - 2 ; i >= 0 ; i--) {
	    		if (0 < height[i] && max < height[i]) {
	    			max = height[i];
	    			sum += t;
	    			t = 0;
	    		}
	    		else if (max > height[i]) {
	    			t += max - height[i];
	    		}
	    	}
    	}
    	
    	return sum;
    }

	public static void main(String[] args) {
		LC0042_TrappingRainWater t = new LC0042_TrappingRainWater();
		System.out.println(t.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
		System.out.println(t.trap(new int[] {4,2,0,3,2,5}));
		System.out.println(t.trap(new int[] {2,1,0,2}));
	}
}
