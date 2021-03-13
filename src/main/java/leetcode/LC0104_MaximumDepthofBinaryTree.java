package leetcode;

public class LC0104_MaximumDepthofBinaryTree {
	public int getDepth(TreeNode root, int depth) {
		if (root == null) return depth;
		return Math.max(getDepth(root.left, depth+1), getDepth(root.right, depth+1));
	}
	
    public int maxDepth(TreeNode root) {
    	if (root == null) return 0;
    	return getDepth(root, 0);
    }
	
	public static void main(String[] args) {
		LC0104_MaximumDepthofBinaryTree t = new LC0104_MaximumDepthofBinaryTree();
		TreeNode tn15 = new TreeNode(15);
		TreeNode tn7  = new TreeNode(7);
		TreeNode tn20 = new TreeNode(20, tn15, tn7);
		TreeNode tn9  = new TreeNode(9);
		TreeNode root = new TreeNode(3, tn9, tn20);
		System.out.println(t.maxDepth(root));
		
		TreeNode tn2 = new TreeNode(2);
		root  = new TreeNode(1, null, tn2);
		System.out.println(t.maxDepth(root));
		
		root  = new TreeNode();
		System.out.println(t.maxDepth(root));
	}
}
