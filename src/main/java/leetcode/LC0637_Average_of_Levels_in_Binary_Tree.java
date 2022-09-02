package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC0637_Average_of_Levels_in_Binary_Tree {
    private Map<Integer, List<Double>> map;
    private int maxDepth;

    private void recur(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        if (maxDepth < depth) {
            maxDepth = depth;
        }

        if (!map.containsKey(depth)) {
            map.put(depth, new ArrayList<>());
        }

        List<Double> list = map.get(depth);
        list.add(root.val + 0.0);
        map.put(depth, list);

        recur(root.left, depth + 1);
        recur(root.right, depth + 1);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        map = new HashMap<>();
        maxDepth = Integer.MIN_VALUE;
        recur(root, 1);

        List<Double> result = new ArrayList<>();
        for (int i = 1; i <= maxDepth; i++) {
            Double average = map.get(i)
                .stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);

            result.add(average);
        }

        return result;
    }
}
