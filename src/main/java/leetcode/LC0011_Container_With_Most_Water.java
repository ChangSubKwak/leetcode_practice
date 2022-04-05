package leetcode;

public class LC0011_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        
        int area = 0;
        while(start < end) {
            area = Math.max(area, Math.min(height[start], height[end]) * (end - start));
            
            if (height[start] < height[end]) {
                start++;
                continue;
            }
            end--;
        }
        return area;
    }
	
    public int maxArea1(int[] height) {
    	int s, e;
    	int max = -123;
    	for (int i = 0 ; i < height.length ; i++) {
    		s = height[i];
    		for (int  j = i + 1 ; j < height.length ; j++) {
    			e = height[j];
    			int w  = j - i;
    			int h = Math.min(s, e);
    			if (max < w*h) {
    				max = w*h;
    			}
    		}
    	}
        return max;
    }
}
