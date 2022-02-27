package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0662_Maximum_Width_of_Binary_Tree {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.val = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	        this.val = val;
	        this.left = left;
	        this.right = right;
	    }
	}
	
    private List<List<Integer>> list;
    
    private void recursiveFunction(TreeNode root, int depth, int val) {
        if (root == null) {
            return;
        }
        
        if (list.size() < depth) {
            list.add(new ArrayList<>());
        }
        
        list.get(depth - 1).add(val);
        recursiveFunction(root.left, depth + 1, 2*val);
        recursiveFunction(root.right, depth + 1, 2*val + 1);
    }
    
    public int widthOfBinaryTree(TreeNode root) {
        list = new ArrayList<>();
        recursiveFunction(root, 1, root.val);
        
        int diffMax = 0;
        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i).get(0);
            int max = list.get(i).get(list.get(i).size() - 1);
            if (diffMax < (max - min + 1)) {
                diffMax = max - min + 1;
            }
        }
        
        return diffMax;
    }
}
