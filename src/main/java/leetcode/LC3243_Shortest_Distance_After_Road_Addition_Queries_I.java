package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC3243_Shortest_Distance_After_Road_Addition_Queries_I {
    private int bfs(int n, List<List<Integer>> adjList) {
        boolean[] visited = new boolean[n];
        Queue<Integer> nodeQueue = new LinkedList<>();

        nodeQueue.add(0);
        visited[0] = true;

        int currentNodeCount = 1;
        int nextNodeCount = 0;
        int explored = 0;

        while (!nodeQueue.isEmpty()) {
            for (int i = 0; i < currentNodeCount; i++) {
                int currentNode = nodeQueue.poll();
                if (currentNode == n - 1) {
                    return explored;
                }

                for (int neighbor : adjList.get(currentNode)) {
                    if (visited[neighbor]) {
                        continue;
                    }
                    nodeQueue.add(neighbor);
                    nextNodeCount++;
                    visited[neighbor] = true;
                }
            }
            currentNodeCount = nextNodeCount;
            nextNodeCount = 0;
            explored++;
        }

        return -1;
    }

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<Integer> answer = new ArrayList<>();
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            adjList.get(i).add(i + 1);
        }

        for (int[] road : queries) {
            int u = road[0];
            int v = road[1];
            adjList.get(u).add(v);
            answer.add(bfs(n, adjList));
        }

        return answer.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}
