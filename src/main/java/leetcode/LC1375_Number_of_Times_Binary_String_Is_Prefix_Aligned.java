package leetcode;

public class LC1375_Number_of_Times_Binary_String_Is_Prefix_Aligned {
    public int numTimesAllBlue(int[] flips) {
        long sum = 0;
        int count = 0;
        for (long i = 0; i < flips.length; i++) {
            sum += flips[(int)i];
            if (sum == ((i+1)*(i+2)/2)) {
                count++;
            }
        }
        return count;        
    }
}
