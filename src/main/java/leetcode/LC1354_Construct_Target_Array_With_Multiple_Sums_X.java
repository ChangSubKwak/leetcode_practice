package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class LC1354_Construct_Target_Array_With_Multiple_Sums_X {
    public boolean isPossible(int[] target) {
        if (target.length == 1) {
            return target[0] == 1;
        }
    
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        int sum = Arrays.stream(target).sum();
        pq.addAll(
            Arrays.stream(target)
                .boxed()
                .collect(Collectors.toList())
        );
  
        while (pq.peek() != 1) {
            int max = pq.poll();
            if (sum - max == 1) {
                return true;
            }
        
            int finalRemainValue = max % (sum - max);
            sum -= (max - finalRemainValue);
        
            if (finalRemainValue == 0 || finalRemainValue == max) {
                return false;
            }
            else pq.add(finalRemainValue);
        }
        return true;
    }
}
