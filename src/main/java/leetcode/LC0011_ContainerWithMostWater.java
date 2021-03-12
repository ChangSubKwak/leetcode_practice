package main.java.leetcode;

public class LC0011_ContainerWithMostWater {
    public int maxArea(int[] height) {
    	int s, e;
    	
    	int max = -123;
//    	String str = new String(); 
    	for (int i = 0 ; i < height.length ; i++) {
    		s = height[i];
    		for (int  j = i + 1 ; j < height.length ; j++) {
    			e = height[j];
    			int w  = j - i;
    			int h = Math.min(s, e);
    			if (max < w*h) {
    				max = w*h;
    				//str = i + "," + j;
    			}
    		}
    	}
    	
    	//System.out.println(max + " : " + str);
    	
        return max;
    }
	
	public static void main(String[] args) {
		LC0011_ContainerWithMostWater lc = new LC0011_ContainerWithMostWater();
		
		int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println(lc.maxArea(input));
		
	}
}
