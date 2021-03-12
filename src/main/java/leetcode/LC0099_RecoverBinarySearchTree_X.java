package main.java.leetcode;

public class LC0099_RecoverBinarySearchTree_X {
    TreeNode f = null;
    TreeNode s = null;
    TreeNode p = new TreeNode(Integer.MIN_VALUE);
    
    public void recoverTree(TreeNode root) {
        traverse(root);
        int t = f.val;
        f.val = s.val;
        s.val = t;
    }
    
    private void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);
        if (f == null && p.val > root.val) f = p;
        if (f != null && p.val > root.val) s = root;
        p = root;
        traverse(root.right);
    }
	
	public static void main(String[] args) {
		LC0099_RecoverBinarySearchTree_X t = new LC0099_RecoverBinarySearchTree_X();
//		TreeNode tn3 = new TreeNode(3);
//		TreeNode tn1 = new TreeNode(1);
//		TreeNode tn2 = new TreeNode(2, tn1, tn3);
//		System.out.println(t.recoverTree(tn2));
		
//		TreeNode tn6 = new TreeNode(6);
//		TreeNode tn4 = new TreeNode(4);
//		TreeNode tn3 = new TreeNode(3, tn6, tn4);
//		TreeNode tn2 = new TreeNode(2);
//		TreeNode tn5 = new TreeNode(5, tn3, tn2);
//		t.recoverTree(tn5);
		
//		TreeNode tn1 = new TreeNode(1);
//		TreeNode tn2 = new TreeNode(2);
//		TreeNode tn4 = new TreeNode(4, tn2, null);
//		TreeNode tn3 = new TreeNode(3, tn1, tn4);
//		t.recoverTree(tn3);
		
		TreeNode tnMin = new TreeNode(Integer.MIN_VALUE);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3, tnMin, tn2);
		TreeNode tn9 = new TreeNode(9);
		TreeNode tn5 = new TreeNode(5, tn3, tn9);
		t.recoverTree(tn5);
	}
}
