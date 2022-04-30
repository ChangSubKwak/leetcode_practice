package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LC0399_Evaluate_Division_X {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        String[][] equationsArray = equations.stream()
            .map(l -> l.stream().toArray(String[]::new))
            .toArray(String[][]::new);
        
        String[][] queriesArray = queries.stream()
            .map(l -> l.stream().toArray(String[]::new))
            .toArray(String[][]::new);
        
        Map<String, Map<String, Double>> graph = buildGraph(equationsArray, values);
        double[] result = new double[queriesArray.length];
        
        for (int i = 0; i < queriesArray.length; i++) {
            result[i] = getPathWeight(queriesArray[i][0], queriesArray[i][1], new HashSet<>(), graph);
        }  
        
        return result;
    }
    
    private double getPathWeight(String start, String end, Set<String> visited, Map<String, Map<String, Double>> graph) {
        if (!graph.containsKey(start)) {
            return -1.0;
        }
        
        if (graph.get(start).containsKey(end)) {
            return graph.get(start).get(end);
        }
        
        visited.add(start);
        for (Map.Entry<String, Double> neighbour : graph.get(start).entrySet()) {
            if (!visited.contains(neighbour.getKey())) {
                double productWeight = getPathWeight(neighbour.getKey(), end, visited, graph);
                if (productWeight != -1.0) {
                    return neighbour.getValue() * productWeight;
                }
            }
        }
        
        return -1.0;
    }
    
    private Map<String, Map<String, Double>> buildGraph(String[][] equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        String u, v;
        
        for (int i = 0; i < equations.length; i++) {
            u = equations[i][0];
            v = equations[i][1];
            graph.putIfAbsent(u, new HashMap<>());
            graph.get(u).put(v, values[i]);
            graph.putIfAbsent(v, new HashMap<>());
            graph.get(v).put(u, 1 / values[i]);
        }
        
        return graph;
    }
}
