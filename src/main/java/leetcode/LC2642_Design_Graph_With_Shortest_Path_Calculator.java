package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import org.apache.commons.math3.util.Pair;

public class LC2642_Design_Graph_With_Shortest_Path_Calculator {
    static class Graph {
        List<List<Pair<Integer, Integer>>> adjList;
        public Graph(int n, int[][] edges) {
            adjList = new ArrayList<>();
            for (int i = 0; i < n; i++)
                adjList.add(new ArrayList<>());
            for (int[] e : edges)
                adjList.get(e[0]).add(new Pair<>(e[1], e[2]));
        }

        public void addEdge(int[] edge) {
        }

        public int shortestPath(int node1, int node2) {
            return -1;
        }
    }
}
