package leetcode;

public class LC0112_PathSum {
	public static boolean hasPathSum;
	public void traverse(TreeNode root, int sum, int accSum) {
		if (root == null) return;
		if (sum == accSum + root.val && root.left == null && root.right == null) hasPathSum = true;
		if (hasPathSum) return;
		
		traverse(root.left , sum, accSum + root.val);
		traverse(root.right, sum, accSum + root.val);
	}
	
    public boolean hasPathSum(TreeNode root, int sum) {
    	if (root == null) 
    		return false;
    	
    	hasPathSum = false;
    	traverse(root, sum, 0);
    	
    	return hasPathSum;
    }
	
	public static void main(String[] args) {
		LC0112_PathSum t = new LC0112_PathSum();
		
//		TreeNode root = new TreeNode(5);
//		TreeNode ta4 = new TreeNode(4);
//		TreeNode t11 = new TreeNode(11);
//		TreeNode t7 = new TreeNode(7);
//		TreeNode t2 = new TreeNode(2);
//		TreeNode t8 = new TreeNode(8);
//		TreeNode t13 = new TreeNode(13);
//		TreeNode tb4 = new TreeNode(4);
//		TreeNode t1 = new TreeNode(1);
//		
//		root.left  = ta4;
//		ta4.left = t11;
//		t11.left = t7;
//		t11.right = t2;
//		
//		root.right = t8;
//		t8.left = t13;
//		t8.right = tb4;
//		tb4.right = t1;
//		System.out.println(t.hasPathSum(root, 22));
		
		TreeNode root = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);

		root.left = t2;
		root.right = t3;
		System.out.println(t.hasPathSum(root, 5));
	}
}
