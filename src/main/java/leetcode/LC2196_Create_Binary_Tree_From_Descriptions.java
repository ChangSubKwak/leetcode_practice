package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC2196_Create_Binary_Tree_From_Descriptions {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int[] description: descriptions) {
            int parent = description[0];
            int child = description[1];
            boolean isLeft = description[2] == 1 ? true : false;

            set.add(parent);

            TreeNode root = null;

            if (map.containsKey(parent)) {
                root = map.get(parent);
            } else {
                root = new TreeNode(parent);
                map.put(parent, root);
            }

            if (isLeft) {
                if (map.containsKey(child)) {
                    root.left = map.get(child);
                } else {
                    root.left = new TreeNode(child);
                    map.put(child, root.left);
                }
            } else {
                if (map.containsKey(child)) {
                    root.right = map.get(child);
                } else {
                    root.right = new TreeNode(child);
                    map.put(child, root.right);
                }
            }
        }

        for (int[] description: descriptions) {
            int child = description[1];
            set.remove(child);
        }

        // System.out.println("map : " + map);
        // System.out.println("set : " + set);

        int rootValue = set.stream().findFirst().orElseThrow();

        return map.get(rootValue);
    }
}
