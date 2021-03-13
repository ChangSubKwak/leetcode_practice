package leetcode;

import java.util.Arrays;

public class LC0088_MergeSortedArray {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i1 = 0, i2 = 0;
//        while(i1 + i2 < m + n) {
//        	if (i1 >= m) break;
//        	if (i2 >= n) break;
//        	
//        	if (nums1[i1] <= nums2[i2]) i1++;
//        	else {
//        		int temp  = nums1[i1];
//        		nums1[i1] = nums2[i2];
//        		nums2[i2] = temp;
//        		
//        		int i = 0;
//        		while(i < n - 1 && nums2[i] > nums2[i+1]) {
//        			temp  = nums2[i];
//            		nums2[i] = nums2[i+1];
//            		nums2[i+1] = temp;
//        			i++;
//        		}
//        	}
//        }
//        
//       	for (int i = 0 ; i < nums2.length ; i++)
//       		nums1[m + i] = nums2[i];
//    }
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i1 = m - 1;
		int i2 = n - 1;
		int i3 = m + n - 1;
		
		while (i1 >= 0 && i2 >= 0) {
			if (nums1[i1] > nums2[i2]) {
				nums1[i3--] = nums1[i1--];
			} else {
				nums1[i3--] = nums2[i2--];
			}
		}
		
		for (int i = i2 ; i >= 0 ; i-- ) {
			nums1[i3--] = nums2[i];
		}
	}
	
	public static void main(String[] args) {
		LC0088_MergeSortedArray t = new LC0088_MergeSortedArray();
//		int[] A = new int[] {1,2,3,0,0,0};
//		int[] B = new int[] {2,5,6};
//		int[] A = new int[] {4,5,6,0,0,0};
//		int[] B = new int[] {1,2,3};
		int[] A = new int[] {4,0,0,0,0,0};
		int[] B = new int[] {1,2,3,5,6};
		System.out.println(Arrays.toString(A));
//		t.merge(A, 3, B, 3);
		t.merge(A, 1, B, 5);
		System.out.println(Arrays.toString(A));
		
	}
}
