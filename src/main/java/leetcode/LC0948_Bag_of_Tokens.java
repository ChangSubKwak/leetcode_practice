package leetcode;

import java.util.*;
import java.util.stream.*;

public class LC0948_Bag_of_Tokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        LinkedList<Integer> list;
        int score = 0;
        list = Arrays.stream(tokens).boxed().collect(Collectors.toCollection(LinkedList::new));
        Collections.sort(list);

        while(list.size() > 0) {
            int min = list.getFirst();
            if (power >= min) {
                score++;
                power -= min;
                list.removeFirst();
                continue;
            }

            int max = list.getLast();
            if (list.size() > 1 && score >= 1) {
                score--;
                power += max;
                list.removeLast();
                continue;
            }
            break;
        }
        return score;
    }
}
