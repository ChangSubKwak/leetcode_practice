package main.java.leetcode;

public class LC0004_MedianofTwoSortedArrays {
    public double findMedianSortedArrays2(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m > n) { // to ensure m<=n
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && A[i-1] > B[j]) {
                iMax = i - 1; // i is too big
            }
            else { // i is perfect
                int maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
	
	
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	double ans = 0.0;
    	
    	int i1 = 0, i2 = 0;
    	int s1 = nums1.length, s2 = nums2.length;
    	int[] num3 = new int[s1 + s2];
    	
    	boolean isOdd = ( (s1 + s2) % 2 == 1 );
    	
    	for( int i = 0 ; i < s1 + s2 ; i++) {
    		
    		if (i1 == s1) 		{
    			num3[i] = nums2[i2];
    			i2++;
    		}
    		else if (i2 == s2)  {
    			num3[i] = nums1[i1];
    			i1++;
    		}
    		else if (nums1[i1] < nums2[i2]) {
    			num3[i] = nums1[i1];
    			i1++;
    		} else {
    			num3[i] = nums2[i2];
    			i2++;
    		}
    		
    		if (i > ((s1+s2)/2) )
    			break;
    	}
    	
    	int mi = (s1 + s2)/2 ;
    	
    	if (isOdd) ans = num3[mi];
    	else {
    		ans = (num3[mi-1] + num3[mi]) / 2.0;
    	}
    	
    	return ans;
    }
	
	public static void main(String[] args) {
		LC0004_MedianofTwoSortedArrays lc = new LC0004_MedianofTwoSortedArrays();
//		System.out.println(lc.findMedianSortedArrays(new int[]{1,3}, new int[] {2} ));
//		System.out.println(lc.findMedianSortedArrays(new int[]{2}, new int[] {1,3} ));
//		System.out.println(lc.findMedianSortedArrays(new int[]{1,2}, new int[] {3,4} ));
//		System.out.println(lc.findMedianSortedArrays(new int[]{3,4}, new int[] {1,2} ));
//		System.out.println(lc.findMedianSortedArrays(new int[]{}, new int[] {2,3} ));
		System.out.println(lc.findMedianSortedArrays2(new int[]{1,3}, new int[] {2} ));
		
	}
}
