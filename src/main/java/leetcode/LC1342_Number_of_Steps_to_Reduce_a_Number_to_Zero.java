package leetcode;

public class LC1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num != 0) {
            count++;
            if (num % 2 == 0) {
                num /= 2;
                continue;
            }
            num--;
        }
        return count;
    }
}
