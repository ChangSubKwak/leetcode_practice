package leetcode;

public class LC0941_Valid_Mountain_Array {
    public boolean validMountainArray(int[] arr) {
        boolean isIncrease = true;
        boolean isDecrease = false;
        
        if (arr.length < 3 || arr[0] > arr[1]) {
            return false;
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (isIncrease && (arr[i-1] < arr[i])) {
                continue;
            }
            
            if (isIncrease && (arr[i-1] > arr[i])) {
                isIncrease = false;
                isDecrease = true;
            }
            
            if (isDecrease && (arr[i-1] > arr[i])) {
                continue;
            }
            
            return false;
        }
        
        return isDecrease;
    }
}
