package leetcode;

public class LC0110_BalancedBinaryTree_X {
	public int traverse(TreeNode root) {
		if (root == null) return 0 ;
		return Math.max(traverse(root.left), traverse(root.right)) + 1;
	}
	
    public boolean isBalanced(TreeNode root) {
    	if (root == null)
    		return true;
        
        int ldepth = traverse(root.left);
        int rdepth = traverse(root.right);
        
        if (Math.abs(ldepth - rdepth) > 1) return false;
        if (!isBalanced(root.left)) return false;
        if (!isBalanced(root.right)) return false;
        
        return true;
    }
	
	public static void main(String[] args) {
		LC0110_BalancedBinaryTree_X t = new LC0110_BalancedBinaryTree_X();
		
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
		
//		TreeNode root = new TreeNode(1);
//		TreeNode t1 = new TreeNode(2);
//		TreeNode t2 = new TreeNode(3);
//		
//		root.right = t1;
//		t1.right = t2;
		
//		TreeNode root = new TreeNode(1);
//		TreeNode t1 = new TreeNode(2);
//		TreeNode t2 = new TreeNode(2);
//		
//		root.left  = t1;
//		root.right = t2;
//		
//		TreeNode t3 = new TreeNode(3);
//		TreeNode t4 = new TreeNode(3);
//		
//		t1.left  = t3;
//		t2.right = t4;
//		
//		TreeNode t5 = new TreeNode(4);
//		TreeNode t6 = new TreeNode(4);
//		
//		t3.left  = t5;
//		t4.right = t6;
		
		TreeNode root = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);

		root.left  = t2;
		root.right = t3;
		
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		TreeNode t8 = new TreeNode(8);
		t2.left  = t4;
		t2.right = t5;
		t3.left  = t6;
		t4.left  = t8;
		
		
		//System.out.println(root.constructLevelList());
		System.out.println(t.isBalanced(root));
		
	}
}
