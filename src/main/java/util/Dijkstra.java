package util;

public class Dijkstra {
    public int[] execute(int start, int[][] adjacentInfo) {
        int length = adjacentInfo.length;
        int[] distances = new int[length];
        boolean[] visited = new boolean[length];

        for (int i = 0; i < length; i++) {
            distances[i] = adjacentInfo[start][i];
        }

        visited[start] = true;
        for (int i = 0; i < length - 2; i++) {
            int current = getMinIndex(visited, distances);
            visited[current] = true;
            for (int j = 0; j < length; j++) {
                if (!visited[j] && distances[current] + adjacentInfo[current][j] < distances[j]) {
                    distances[j] = distances[current] + adjacentInfo[current][j];
                }
            }
        }

        return distances;
    }

    private int getMinIndex(boolean[] visited, int[] distances) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] < min && !visited[i]) {
                min = distances[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
