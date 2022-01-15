package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class LC0239_Sliding_Window_Maximum {
    public int[] maxSlidingWindow(int[] a, int k) {
		if (a == null || k <= 0) {
			return new int[0];
		}
		int n = a.length;
		int[] r = new int[n-k+1];
		int ri = 0;
		// store index
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < a.length; i++) {
			// remove numbers out of range k
			while (!q.isEmpty() && q.peek() < i - k + 1) {
				q.poll();
			}
            // System.out.println("1 : " + i + " : " + q);
            
			// remove smaller numbers in k range as they are useless
			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
				q.pollLast();
			}
            // System.out.println("2 : " + i + " : " + q);
            
			// q contains index... r contains content
			q.offer(i);
            // System.out.println("3 : " + i + " : " + q);
			if (i >= k - 1) {
				r[ri++] = a[q.peek()];
                // System.out.println("Result : " + Arrays.toString(r));
			}
		}
		return r;
	}
	

	/*
    LinkedList<Integer> list = new LinkedList<>();
    int[] globalNums;
    
    public void checkNDelList(int i, int k) {
    	// 범위를 벗어난 것에 대한 제거 처리
        if (!list.isEmpty() && list.getFirst() == i - k)
            list.removeFirst();
        
        // 새롭게 추가될 값보다 작은 모든 것을 제거하기
        while (!list.isEmpty() && globalNums[i] > globalNums[list.getLast()])
            list.removeLast();
    }
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return new int[0];
        if (k == 1) return nums;
        
        globalNums = nums;
        int maxIdx = 0;
        for (int i = 0 ; i < k ; i++) {
            checkNDelList(i, k);
            list.addLast(i);
            if (nums[i] > nums[maxIdx])
                maxIdx = i;
        }
        
        int[] output = new int [n - k + 1];
        output[0] = nums[maxIdx];
        
        for (int i = k ; i < n ; i++) {
            checkNDelList(i, k);
            list.addLast(i);
            output[i - k + 1] = nums[list.getFirst()];		// 최대값은 list의 첫번째 인덱스에 해당하는 값임
        }
        
        return output;
    }
	*/
	
	
	/*
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int max = 0;
        int[] sw = new int[len - k + 1];
        
        int maxIdx = 0;
        for (int i = 0 ; i < k ; i++)
            if (max < nums[i]) {
                max = nums[i];
                maxIdx = i;
            }
        sw[0] = max;
        
        int idx = 1;
        for (int i = 1 ; i < len - k + 1 ; i++) {
            if (maxIdx == i - 1) {
                max = nums[i];
                maxIdx = i;
                for (int j = 0 ; j < k ; j++) {
                    if (max < nums[i + j]) {
                        max = nums[i + j];
                        maxIdx = i + j;
                    }
                }
            } else if (max < nums[i + k - 1]) {
                max = nums[i + k - 1];
                maxIdx = i + k - 1;
            }
                        
            sw[idx++] = max;
        }
        
        return sw;
    }
    //*/
    //*/
	
	/*
	public int[] maxSlidingWindow(int[] a, int k) {		
		if (a == null || k <= 0) {
			return new int[0];
		}
		int n = a.length;
		int[] r = new int[n-k+1];
		int ri = 0;
		
		// store index
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < a.length; i++) {
			// remove numbers out of range k
			while (!q.isEmpty() && q.peek() < i - k + 1) {
				q.poll();
			}
			// remove smaller numbers in k range as they are useless
			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
				q.pollLast();
			}
			// q contains index... r contains content
			q.offer(i);
			if (i >= k - 1) {
				r[ri++] = a[q.peek()];
			}
		}
		return r;
	}
	//*/

	public static void main(String[] args) {
		//System.arraycopy(src, srcPos, dest, destPos, length);
		LC0239_Sliding_Window_Maximum t = new LC0239_Sliding_Window_Maximum();
//		System.out.println(
//				Arrays.toString(t.maxSlidingWindow(new int[] {9,10,9,-7,-4,-8,2,-6}, 5))
//				);
		System.out.println(Arrays.toString(t.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3)));
	}

}
