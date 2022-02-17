package leetcode;

public class LC0104_Maximum_Depth_of_Binary_Tree {
    private int depth;
    private int max;
    
    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        if (max < depth) {
            max = depth;
        }
        depth++;
        traverse(root.left);
        traverse(root.right);
        depth--;
    }
    
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        depth = 1;
        max = 0;
        traverse(root);
        
        return max;
    }
	
	// #1
	/*
	public int getDepth(TreeNode root, int depth) {
		if (root == null) return depth;
		return Math.max(getDepth(root.left, depth+1), getDepth(root.right, depth+1));
	}
	
    public int maxDepth(TreeNode root) {
    	if (root == null) return 0;
    	return getDepth(root, 0);
    }
    */
}
