package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0797_All_Paths_From_Source_to_Target {
    private List<List<Integer>> result;
    private boolean[] visited;

    private void recur(int[][] graph, int node, List<Integer> path) {
        if (node == graph.length - 1) {
            path.add(node);
            result.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        visited[node] = true;
        path.add(node);
        for (int i = 0; i < graph[node].length; i++) {
            int nextNode = graph[node][i];
            if (visited[nextNode]) {
                continue;
            }
            recur(graph, nextNode, path);
        }
        path.remove(path.size() - 1);
        visited[node] = false;
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result = new ArrayList<>();
        visited = new boolean[graph.length];

        recur(graph, 0, new ArrayList<>());

        return result;
    }
}
