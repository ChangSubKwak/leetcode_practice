package leetcode;

public class LC0111_MinimumDepthofBinaryTree {
	public int minDepth = 100001;
	
	public void traverse(TreeNode root, int depth) {
		if (root == null) return;
		
		if (root.left == null && root.right == null) {
			if (minDepth > depth)
				minDepth = depth;
		}
		
		traverse(root.left , depth + 1);
		traverse(root.right, depth + 1);
	}
	
    public int minDepth(TreeNode root) {
    	if (root == null) return 0;
    	traverse(root, 1);
        return minDepth;
    }
	
	public static void main(String[] args) {
		LC0111_MinimumDepthofBinaryTree t = new LC0111_MinimumDepthofBinaryTree();
		
//		TreeNode root = new TreeNode(3);
//		TreeNode t1 = new TreeNode(9);
//		TreeNode t2 = new TreeNode(20);
//		TreeNode t3 = new TreeNode(15);
//		TreeNode t4 = new TreeNode(7);
//		
//		t2.left  = t3;
//		t2.right = t4;
//		
//		root.left  = t1;
//		root.right = t2;
		
		TreeNode root = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		
		root.right  = t3;
		t3.right = t4;
		t4.right = t5;
		t5.right = t6;
		
		System.out.println(t.minDepth(root));
	}
}
