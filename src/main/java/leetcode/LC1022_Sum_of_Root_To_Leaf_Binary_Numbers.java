package leetcode;

public class LC1022_Sum_of_Root_To_Leaf_Binary_Numbers {
    private int sum;
    
    private void recursive(TreeNode root, String tree) {
        if (root == null) {
            System.out.println(tree);
            sum += Integer.parseInt(tree, 2);
            return;
        }
        tree += root.val;
        recursive(root.left, tree);
        recursive(root.right, tree);
    }
    
    public int sumRootToLeaf(TreeNode root) {
        sum = 0;
        recursive(root, "");
        return sum/2;
    }
}