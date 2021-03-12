package main.java.leetcode;

/*
 * 각 높이별로 영향을 미치는 인덱스 값을 구하는 것이 핵심 
 */

public class LC0084_LargestRectangleinHistogram_X {
	/*
    public int largestRectangleArea(int[] heights) {
    	int len = heights.length;
    	int maxArea = 0;
    	
    	for (int w = 1 ; w <= len ; w++) {
    		int minHeightIdx = 0;
    		int minHeight = Integer.MAX_VALUE;
    		for (int j = 0 ; j < w ; j++ ) {
    			if (minHeight > heights[j]) {
    				minHeight = heights[j];
    				minHeightIdx = j;
    			}
    		}
    		
    		for (int j = 0 ; j <= len - w ; j++ ) {
    			if (minHeightIdx < j) {
    				minHeight = heights[j];
    				minHeightIdx = j;
    	    		for (int k = j ; k < j + w ; k++ ) {
    	    			if (minHeight > heights[k]) {
    	    				minHeight = heights[k];
    	    				minHeightIdx = k;
    	    			}
    	    		}
    			}
    			
    			if (minHeight > heights[j + w - 1]) {
    				minHeight = heights[j + w - 1];
    				minHeightIdx = j + w - 1;
    			}
    				
    			
    			if (maxArea < w * minHeight)
    				maxArea = w * minHeight; 
    		}
    	}
    	
        return maxArea;
    }
    */
	
	//*
	public static int largestRectangleArea(int[] height) {
	    if (height == null || height.length == 0) {
	        return 0;
	    }
	    int[] lessFromLeft = new int[height.length]; // idx of the first bar the left that is lower than current
	    int[] lessFromRight = new int[height.length]; // idx of the first bar the right that is lower than current
	    lessFromRight[height.length - 1] = height.length;
	    lessFromLeft[0] = -1;

	    for (int i = 1; i < height.length; i++) {
	        int p = i - 1;

	        while (p >= 0 && height[p] >= height[i]) {
	            p = lessFromLeft[p];
	        }
	        lessFromLeft[i] = p;
	    }

	    for (int i = height.length - 2; i >= 0; i--) {
	        int p = i + 1;

	        while (p < height.length && height[p] >= height[i]) {
	            p = lessFromRight[p];
	        }
	        lessFromRight[i] = p;
	    }

	    int maxArea = 0;
	    for (int i = 0; i < height.length; i++) {
	        maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
	        System.out.println(i + " : " + height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
	    }

	    return maxArea;
	}
	//*/
	
	/*
	public static int largestRectangleArea(int[] height) {
	    if (height == null || height.length == 0) {
	        return 0;
	    }
	    List<Integer> heightList = Arrays.stream(height).boxed().collect(Collectors.toList());
	    heightList.add(0);
	    Stack<Integer> stack = new Stack<>();
	    stack.add(-1);
	    int ans = 0;
	    
	    for (int i = 0 ; i < heightList.size() ; i++) {
	    	int left  = heightList.get(i);
	    	int right = heightList.get(stack.peek() == -1 ? heightList.size() -1 : stack.peek() );
	    	//while(heightList.get(i) < heightList.get(stack.peek() == -1 ? heightList.size() -1 : stack.peek() )) {
	    	while(left < right) {
	    		int t = stack.pop();
	    		int h = heightList.get(t == -1 ? heightList.size() - 1 : t);
	    		int w = i - stack.peek() - 1;
	    		ans = Math.max(ans, h * w);
	    		
	    		left  = heightList.get(i);
	    		right = heightList.get(stack.peek() == -1 ? heightList.size() -1 : stack.peek() );
	    	}
	    	stack.add(i);
	    }
	    heightList.remove(heightList.size() - 1);
	    
	    return ans;
	}
	//*/
	
	/*
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        return getMax(heights, 0, heights.length);
    }    
    int getMax(int[] heights, int s, int e) {
        if (s + 1 >= e) return heights[s];
        int min = s;
        boolean sorted = true;
        for (int i = s; i < e; i++) {
            if (i > s && heights[i] < heights[i - 1]) sorted = false;
            if (heights[min] > heights[i]) min = i;
        }
        if (sorted) {
            int max = 0;
            for (int i = s; i < e; i++) {
                max = Math.max(max, heights[i] * (e - i));
            }
            return max;
        }
        int left = (min > s) ? getMax(heights, s, min) : 0;
        int right = (min < e - 1) ? getMax(heights, min + 1, e) : 0;
        return Math.max(Math.max(left, right), (e - s) * heights[min]);
    }
    //*/
	
	public static void main(String[] args) {
		//LC0084_LargestRectangleinHistogram_X t = new LC0084_LargestRectangleinHistogram_X();
		System.out.println(largestRectangleArea(new int[] {2,1,5,6,2,3}));
	}
}
