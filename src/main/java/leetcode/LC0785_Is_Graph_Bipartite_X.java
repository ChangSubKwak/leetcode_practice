package leetcode;

public class LC0785_Is_Graph_Bipartite_X {
	public boolean isBipartite(int[][] graph) {
		int n = graph.length;
		int[] colors = new int[n];

		// This graph might be a disconnected graph. So check each unvisited node.
		for (int i = 0; i < n; i++) {
			if (colors[i] == 0 && !validColor(graph, colors, 1, i)) {
				return false;
			}
		}
		return true;
	}

	public boolean validColor(int[][] graph, int[] colors, int color, int node) {
		if (colors[node] != 0) {
			return colors[node] == color;
		}
		colors[node] = color;
		for (int next : graph[node]) {
			if (!validColor(graph, colors, -color, next)) {
				return false;
			}
		}
		return true;
	}
}
