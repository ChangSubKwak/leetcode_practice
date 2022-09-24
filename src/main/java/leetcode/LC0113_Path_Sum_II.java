package leetcode;

import java.util.*;

public class LC0113_Path_Sum_II {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        recur(root, targetSum, new ArrayList<>(), 0, result);
        return result;
    }

    private void recur(TreeNode root, int targetSum, List<Integer> path, int sum, List<List<Integer>> result) {
        if (Objects.isNull(root)) {
            return;
        }

        sum += root.val;
        path.add(root.val);
        if (sum == targetSum && Objects.isNull(root.left) && Objects.isNull(root.right)) {
            result.add(new ArrayList<>(path));
        }

        recur(root.left, targetSum, path, sum, result);
        recur(root.right, targetSum, path, sum, result);
        path.remove(path.size() - 1);
    }
}
