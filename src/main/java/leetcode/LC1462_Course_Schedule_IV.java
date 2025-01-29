package leetcode;

import java.util.List;

public class LC1462_Course_Schedule_IV {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        
        for (int[] edge : prerequisites) {
            adjList.computeIfAbsent(edge[0], k -> new ArrayList<>())
                .add(edge[1]);
        }

        return null;
    }
}
