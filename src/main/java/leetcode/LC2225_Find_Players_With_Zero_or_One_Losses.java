package leetcode;

import java.util.*;

public class LC2225_Find_Players_With_Zero_or_One_Losses {
    public List<List<Integer>> findWinners(int[][] matches) {
         Map<Integer, Integer> winCount = new HashMap<>();
         Map<Integer, Integer> loseCount = new HashMap<>();
         int length = matches.length;
         for (int i = 0; i < length; i++) {
             int winner = matches[i][0];
             int loser  = matches[i][1];

             winCount.put(winner, winCount.getOrDefault(winner, 0) + 1);
             loseCount.put(loser, loseCount.getOrDefault(loser, 0) + 1);
         }

         List<Integer> winList = new ArrayList<>();
         for (Map.Entry<Integer, Integer> e : winCount.entrySet()) {
             if (loseCount.containsKey(e.getKey())) {
                 continue;
             }
             winList.add(e.getKey());
         }

         List<Integer> oneLostList = new ArrayList<>();
         for (Map.Entry<Integer, Integer> e : loseCount.entrySet()) {
             if (e.getValue() == 1) {
                 oneLostList.add(e.getKey());
             }
         }

         Collections.sort(winList);
         Collections.sort(oneLostList);

         return Arrays.asList(winList, oneLostList);
     }
}
