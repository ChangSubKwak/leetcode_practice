package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC1557_Minimum_Number_of_Vertices_to_Reach_All {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
      boolean[] isIncomingEdgeExists = new boolean[n];
      for (List<Integer> edge : edges) {
        isIncomingEdgeExists[edge.get(1)] = true;
      }

      List<Integer> requiredNodes = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        if (!isIncomingEdgeExists[i]) {
          requiredNodes.add(i);
        }
      }

      return requiredNodes;
    }
}
