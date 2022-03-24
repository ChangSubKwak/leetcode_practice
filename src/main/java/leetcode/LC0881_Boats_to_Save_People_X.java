package leetcode;

import java.util.Arrays;

public class LC0881_Boats_to_Save_People_X {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int head = 0;
        int tail = people.length - 1;
        int count = 0;
        
        while (head <= tail) {
            count++;
            if (people[head] + people[tail] <= limit) {
                head++;
            }
            tail--;
        }
        return count;
    }
}
