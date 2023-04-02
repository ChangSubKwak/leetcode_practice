package leetcode;

import java.util.*;

public class LC2300_Successful_Pairs_of_Spells_and_Potions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] answer = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int targetIndex = searchIndex(spells[i], potions, success);
            if (targetIndex == -1) {
                answer[i] = 0;
                continue;
            }
            answer[i] = potions.length - targetIndex;
        }

        return answer;
    }

    private int searchIndex(long spell, int[] potions, long success) {
        int start = 0;
        int end = potions.length - 1;
        int answer = -1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (spell * potions[middle] >= success) {
                answer = middle;
                end = middle - 1;
                continue;
            }

            start = middle + 1;
        }

        return answer;
    }
}
