package leetcode;

import java.util.*;

public class LC0987_Vertical_Order_Traversal_of_a_Binary_Tree {
    private Map<Integer,Map<Integer, List<Integer>>> map;
    private int rowMin, rowMax;
    private int colMin, colMax;

    private void recur(TreeNode root, int row, int col) {
        if (root == null) {
            return;
        }

        if (rowMax < row) {
            rowMax = row;
        }

        if (rowMin > row) {
            rowMin = row;
        }

        if (colMax < col) {
            colMax = col;
        }

        if (colMin > col) {
            colMin = col;
        }

        if (!map.containsKey(col)) {
            map.put(col, new HashMap<>());
        }

        Map<Integer, List<Integer>> tempMap = map.get(col);

        if (!tempMap.containsKey(row)) {
            tempMap.put(row, new ArrayList<>());
        }

        List<Integer> list = tempMap.get(row);
        list.add(root.val);
        tempMap.put(row, list);
        map.put(col, tempMap);

        recur(root.left, row + 1, col - 1);
        recur(root.right, row + 1, col + 1);
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        map = new HashMap<>();
        colMin = Integer.MAX_VALUE;
        colMax = Integer.MIN_VALUE;

        recur(root, 0, 0);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = colMin; i <= colMax; i++) {
            if (!map.containsKey(i)) {
                continue;
            }

            Map<Integer, List<Integer>> tempMap = map.get(i);
            List<Integer> list = new ArrayList<>();
            for (int j = rowMin; j <= rowMax; j++) {
                if (!tempMap.containsKey(j)) {
                    continue;
                }
                List<Integer> tempList = tempMap.get(j);
                Collections.sort(tempList);
                list.addAll(tempList);
            }
            result.add(list);
        }

        // System.out.println("colMin = " + colMin);
        // System.out.println("colMax = " + colMax);
        // System.out.println("map = " + map);
        // System.out.println("result = " + result);

        return result;
    }
}
