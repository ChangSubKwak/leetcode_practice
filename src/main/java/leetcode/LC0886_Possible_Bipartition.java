package leetcode;

public class LC0886_Possible_Bipartition {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[][] graph = new int[n][n];
        for (int[] dislike : dislikes) {
            graph[dislike[0] - 1][dislike[1] - 1] = 1;
            graph[dislike[1] - 1][dislike[0] - 1] = 1;
        }

        int[] colors = new int[n];
        for (int i = 0; i < n; i++) {
            if (colors[i] == 0 && !paint(graph, colors, i, 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean paint(int[][] graph, int[] colors, int index, int color) {
        colors[index] = color;
        for (int i = 0; i < graph.length; i++) {
            if (graph[index][i] == 1 && colors[i] == color) {
                return false;
            }

            if (graph[index][i] == 1 && colors[i] == 0 && !paint(graph, colors, i, -color)) {
                return false;
            }
        }
        return true;
    }
}
