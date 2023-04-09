package leetcode;

import java.util.*;

public class LC1857_Largest_Color_Value_in_a_Directed_Graph {
    public int largestPathValue(String colors, int[][] edges) {
        int colorsLength = colors.length();
        int alaphabetSize = 26;
        int[] indegrees = new int[colorsLength];

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < colorsLength; i++) {
            graph.add(new ArrayList<>());
        }

        for (int [] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            graph.get(from).add(to);
            indegrees[to]++;
        }

        Set<Integer> zeroIndegree = new HashSet<>();
        for (int i = 0; i < colorsLength; i++) {
            if (indegrees[i] == 0) {
                zeroIndegree.add(i);
            }
        }

        int[][] counts = new int[colorsLength][alaphabetSize];
        for (int i = 0; i < colorsLength; i++) {
            counts[i][colors.charAt(i) - 'a']++;
        }

        int maxCount = 0;
        int visitedCount = 0;
        while (!zeroIndegree.isEmpty()) {
            int from = zeroIndegree.iterator().next();
            zeroIndegree.remove(from);
            visitedCount++;

            for (int to : graph.get(from)) {
                for (int i = 0; i < alaphabetSize; i++) {
                    counts[to][i] = Math.max(counts[to][i], counts[from][i] + (colors.charAt(to) - 'a' == i ? 1 : 0));
                }
                indegrees[to]--;
                if (indegrees[to] == 0) {
                    zeroIndegree.add(to);
                }
            }
            maxCount = Math.max(maxCount, Arrays.stream(counts[from]).max().getAsInt());
        }

        return visitedCount == colorsLength ? maxCount : -1;
    }
}
