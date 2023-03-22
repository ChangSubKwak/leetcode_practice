package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC2492_Minimum_Score_of_a_Path_Between_Two_Cities {
    private static class Pair{
        int node;
        int dist;

        Pair(int node, int dist){
            this.node = node;
            this.dist = dist;
        }
    }

    public int minScore(int n, int[][] roads) {
        List<List<Pair>> adjacent = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adjacent.add(new ArrayList<>());
        }

        for (int i = 0; i < roads.length; i++) {
            adjacent.get(roads[i][0]).add(new Pair(roads[i][1], roads[i][2]));
            adjacent.get(roads[i][1]).add(new Pair(roads[i][0], roads[i][2]));
        }

        Queue<Pair> queue = new LinkedList<>();
        boolean[] visit = new boolean[n + 1];

        visit[1] = true;
        queue.add(new Pair(1, Integer.MAX_VALUE));

        int answer = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            answer = Math.min(answer, pair.dist);
            for (Pair adjacentNode : adjacent.get(pair.node)) {
                if (!visit[adjacentNode.node]) {
                    queue.add(adjacentNode);
                    visit[pair.node] = true;
                }
            }
        }

        return answer;

    }
}
