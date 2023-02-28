package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LC0652_Find_Duplicate_Subtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new LinkedList<>();
        postOrder(root, new HashMap<>(), result);

        return result;
    }

    public String postOrder(TreeNode current, Map<String, Integer> map, List<TreeNode> result) {
        if (current == null) {
            return "#";
        }

        String serial = current.val + "," + postOrder(current.left, map, result) + "," + postOrder(current.right, map, result);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        if (map.get(serial) == 2) {
            result.add(current);
        }
        return serial;
    }
}
