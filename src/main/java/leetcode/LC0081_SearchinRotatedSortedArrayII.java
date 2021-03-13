package leetcode;

public class LC0081_SearchinRotatedSortedArrayII {
	public boolean myBS(int[] array, int target, int left, int right) {
		if (left > right) return false;
		
		int mid = (left + right) / 2;
		if (mid >= array.length) return false;
		
		if (target == array[mid]) return true;
		else if (target > array[mid]) return myBS(array, target, mid+1, right);
		else                          return myBS(array, target, left, mid-1);
	}
	
    public boolean search(int[] nums, int target) {
    	int len = nums.length;
    	if (len == 0) return false;
    	
    	int[] t = new int[len];
    	int start = -1;
    	for (int i = 0 ; i < len - 1 ; i++) {
    		if (nums[i] > nums[i+1]) {
    			start = i;
    			break;
    		}
    	}
    	
    	if (start != -1) {
    		System.arraycopy(nums, start+1, t, 0, len - start - 1);
    		System.arraycopy(nums, 0, t, len - start - 1, start + 1);
    	} else {
    		System.arraycopy(nums, 0, t, 0, len);
    	}
//    	System.out.println(Arrays.toString(t));
//    	System.out.println(Arrays.toString(t) + " : " + target + " --> " + Arrays.binarySearch(t, target));
//    	return Arrays.binarySearch(t, target) >= 0;
    	return myBS(t, target, 0, len);
    }
	
	public static void main(String[] args) {
		LC0081_SearchinRotatedSortedArrayII t = new LC0081_SearchinRotatedSortedArrayII();
		System.out.println(t.search(new int[]{1}, 2));
		System.out.println(t.search(new int[]{3, 1}, 1));
		System.out.println(t.search(new int[]{1}, 1));
		System.out.println(t.search(new int[]{2,5,6,0,0,1,2}, 0));
		System.out.println(t.search(new int[]{2,5,6,0,0,1,2}, 3));
//		t.search(new int[]{2,5,6,0,0,1,2}, -1);
//		t.search(new int[]{2,5,6,0,0,1,2}, 0);
//		t.search(new int[]{2,5,6,0,0,1,2}, 3);
//		t.search(new int[]{2,5,6,0,0,1,2}, 4);
//		t.search(new int[]{2,5,6,0,0,1,2}, 5);
	}
}
