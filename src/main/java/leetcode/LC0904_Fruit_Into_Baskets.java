package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0904_Fruit_Into_Baskets {
    public int totalFruit(int[] fruits) {
        int length = fruits.length;

        Map<Integer, Integer> count = new HashMap<>();
        int left = 0;
        int previousKey = fruits[0];
        int max = -1;

        for (int i = 0; i < length; i++) {
            count.put(fruits[i], count.getOrDefault(fruits[i], 0) + 1);

            if (count.size() == 1) {
                max = Math.max(max, count.get(previousKey));
                continue;
            }

            if (count.size() == 2) {
                int sum = 0;
                for(int key : count.keySet()) {
                    sum += count.get(key);
                }
                max = Math.max(max, sum);
                continue;
            }

            if (count.size() > 2) {
                max = Math.max(max, i - left);
                int j;
                for (j = left; j < i; j++) {
                    count.put(fruits[j], count.get(fruits[j]) - 1);
                    if (count.get(fruits[j]) == 0) {
                        count.remove(fruits[j]);
                    }

                    if (count.size() <= 2) {
                        break;
                    }
                }
                left = j + 1;
                previousKey = fruits[i - 1];
            }
        }

        return max;
    }
}
