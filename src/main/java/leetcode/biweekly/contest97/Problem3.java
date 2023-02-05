package leetcode.biweekly.contest97;

import java.util.*;

public class Problem3 {
    private static class Pair {
        public int left;
        public int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
        }
    }
    public int maximizeWin(int[] prizePositions, int k) {
        // if (prizePositions[prizePositions.length - 1] - prizePositions[0] < k) {
        //     return 0;
        // }

        Map<Integer, Integer> countMap = new HashMap<>();
        TreeSet<Integer> numsSet = new TreeSet<>();

        for (int i = 0; i < prizePositions.length; i++) {
            numsSet.add(prizePositions[i]);
            countMap.put(prizePositions[i], countMap.getOrDefault(prizePositions[i], 0) + 1);
        }

        List<Pair> pairList = new ArrayList<>();
        for (Integer i : numsSet) {
            // if (numsSet.contains(i + k)) {
            pairList.add(new Pair(i, i + k));
            // }
        }

        TreeMap<Integer, List<Pair>> sumMap = new TreeMap<>(Collections.reverseOrder());
        for (Pair pair : pairList) {
            int sum = 0;
            for (int i = pair.left; i <= pair.right; i++) {
                sum += countMap.getOrDefault(i, 0);
            }
            List<Pair> tempPair = new ArrayList<>();
            if (sumMap.containsKey(sum)) {
                tempPair = sumMap.get(sum);
            }
            tempPair.add(pair);
            sumMap.put(sum, tempPair);
        }

        List<Pair> resultList = sumMap.firstEntry().getValue();
        if (resultList.size() >= 2) {
            Collections.sort(resultList, Comparator.comparingInt(e -> e.left));
            int sum = 0;
            for (int i = resultList.get(0).left; i <= resultList.get(0).right; i++) {
                if (countMap.containsKey(i)) {
                    sum += countMap.get(i);
                }
            }

            int lastIndex = resultList.size() - 1;
            for (int i = resultList.get(lastIndex).left; i <= resultList.get(lastIndex).right; i++) {
                if (countMap.containsKey(i)) {
                    sum += countMap.get(i);
                }
            }

            for (int i = resultList.get(lastIndex).left; i <= resultList.get(0).right; i++) {
                if (countMap.containsKey(i)) {
                    sum -= countMap.get(i);
                }
            }
            return sum;

        }

        int sum = 0;
        for (int i = resultList.get(0).left; i <= resultList.get(0).right; i++) {
            if (countMap.containsKey(i)) {
                sum += countMap.get(i);
            }
        }

        int sumMapIndex = 0;
        List<Pair> secondPair = null;
        for (List<Pair> pairs : sumMap.values()) {
            if (sumMapIndex == 0) {
                sumMapIndex++;
                continue;
            }

            if (pairs.size() == 0) {
                if (resultList.get(0).right < pairs.get(0).left) {
                    secondPair = pairs;
                    break;
                }
            } else {
                boolean isFound = false;
                for (Pair pair : pairs) {
                    if (resultList.get(0).right < pair.left) {
                        secondPair = pairs;
                        isFound = true;
                        break;
                    }
                }
            }
        }

        if (secondPair == null) {
            secondPair = sumMap.entrySet().stream()
                .skip(sumMap.size() - 1)
                .map(e -> e.getValue())
                .findFirst()
                .get();
        }

        for (int i = secondPair.get(0).left; i <= secondPair.get(0).right; i++) {
            if (countMap.containsKey(i)) {
                sum += countMap.get(i);
            }

        }

        for (int i = secondPair.get(0).left; i <= resultList.get(0).right; i++) {
            if (countMap.containsKey(i)) {
                sum -= countMap.get(i);
            }
        }

        return sum;
    }
}
