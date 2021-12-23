package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC0210_Course_Schedule_II_X {
	private static final int WHITE = 1;      // not visited
    private static final int GRAY = 2;       // visiting
    private static final int BLACK = 3;      // visited

    private boolean isPossible;
    private Map<Integer, Integer> color;
    private Map<Integer, List<Integer>> adjList;
    private List<Integer> topologicalOrder;

    private void init(int numCourses) {
        isPossible = true;
        color = new HashMap<Integer, Integer>();
        adjList = new HashMap<Integer, List<Integer>>();
        topologicalOrder = new ArrayList<Integer>();

        for (int i = 0; i < numCourses; i++) {
            color.put(i, WHITE);
        }
    }

    private void dfs(int node) {
        if (!isPossible) {
          return;
        }

        color.put(node, GRAY);
        for (Integer neighbor : adjList.getOrDefault(node, new ArrayList<Integer>())) {
            if (color.get(neighbor) == WHITE) {
                dfs(neighbor);
            } else if (color.get(neighbor) == GRAY) {
                isPossible = false;
            }
        }

        color.put(node, BLACK);
        topologicalOrder.add(node);
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        init(numCourses);

        for (int i = 0; i < prerequisites.length; i++) {
            int dest = prerequisites[i][0];
            int src = prerequisites[i][1];
            List<Integer> lst = adjList.getOrDefault(src, new ArrayList<Integer>());
            lst.add(dest);
            adjList.put(src, lst);
        }

        for (int i = 0; i < numCourses; i++) {
            if (color.get(i) == WHITE) {
                dfs(i);
            }
        }

        int[] order;
        if (isPossible) {
            order = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                order[i] = topologicalOrder.get(numCourses - i - 1);
            }
        } else {
            order = new int[0];
        }

        return order;
    }
}
