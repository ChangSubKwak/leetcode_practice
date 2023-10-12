package leetcode;

public class LC1095_Find_in_Mountain_Array {
    public int findInMountainArray(int target, MountainArray mountainArray) {
        int length = mountainArray.length();

        int low = 1;
        int high = length - 2;
        while (low != high) {
            int mid = (low + high) / 2;
            if (mountainArray.get(mid) < mountainArray.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        int peakIndex = low;

        low = 0;
        high = peakIndex;
        while (low != high) {
            int mid = (low + high) / 2;
            if (mountainArray.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        if (mountainArray.get(low) == target) {
            return low;
        }


        low = peakIndex + 1;
        high = length - 1;
        while (low != high) {
            int mid = (low + high) / 2;
            if (mountainArray.get(mid) > target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        if (mountainArray.get(low) == target) {
            return low;
        }

        return -1;
    }

    static class MountainArray {
        private final int[] array;

        public MountainArray(int[] array) {
            this.array = array;
        }

        public int get(int index) {
            return array[index];
        }

        public int length() {
            return array.length;
        }
    }
}
