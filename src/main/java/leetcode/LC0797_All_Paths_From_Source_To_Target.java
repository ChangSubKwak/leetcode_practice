package leetcode;

public class LC0797_All_Paths_From_Source_To_Target {
    List<List<Integer>> result;
    int size;
    
    private void recursive(int[][] graph, int row, List<Integer> list) {
        if (row == size - 1) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = 0; i < graph[row].length; i++) {
            list.add(graph[row][i]);
            recursive(graph, graph[row][i], list);
            list.remove(list.size() - 1);
        }
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int col = graph[0].length;
        size = graph.length;
        
        result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 0; i < col; i++) {
            list.add(graph[0][i]);
            recursive(graph, graph[0][i], list);
            list.remove(list.size() - 1);
        }
        
        return result;
    }
}
