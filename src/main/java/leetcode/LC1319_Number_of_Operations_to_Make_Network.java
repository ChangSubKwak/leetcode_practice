package leetcode;

import java.util.Arrays;

public class LC1319_Number_of_Operations_to_Make_Network {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return - 1;
        }

        int[] parent = new int[n];
        int[] priority = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        Arrays.fill(priority, 1);

        for (int i = 0; i < connections.length; i++) {
            union(parent, priority, connections[i][0], connections[i][1]);
        }

        int unconnectedCount = 0;
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == i) {
                unconnectedCount++;
            }
        }

        return unconnectedCount - 1;
    }

    private void union(int[] parent, int[] priority, int from, int to) {
        int parentFrom = find(parent, from);
        int parentTo = find(parent, to);

        if (parentFrom == parentTo) {
            return;
        }

        if (priority[parentFrom] > priority[parentTo]) {
            parent[parentTo] = parent[parentFrom];
            return;
        }

        if (priority[parentFrom] < priority[parentTo]) {
            parent[parentFrom] = parent[parentTo];
            return;
        }

        parent[parentTo] = parent[parentFrom];
        priority[parentTo]++;
    }

    private int find(int[] parent, int from) {
        if (parent[from] == from) {
            return from;
        }

        int lastParent = find(parent, parent[from]);
        parent[from] = lastParent;
        return parent[from];
    }
}
