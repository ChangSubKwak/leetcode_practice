package leetcode;

public class LC0101_SymmetricTree_X {
	public boolean recursive(TreeNode left, TreeNode right) {
		if (left == null || right == null)
			return left == right;
		if (left.val != right.val)
			return false;
		
		return recursive(left.left, right.right) && recursive(left.right, right.left); 
	}
	
    public boolean isSymmetric(TreeNode root) {
    	return root == null || recursive(root.left, root.right);
    }
	
	public static void main(String[] args) {
		LC0101_SymmetricTree_X t = new LC0101_SymmetricTree_X();
//		TreeNode ltn3 = new TreeNode(3);
//		TreeNode ltn4 = new TreeNode(4);
//		TreeNode rtn4 = new TreeNode(4);
//		TreeNode rtn3 = new TreeNode(3);
//		
//		TreeNode ltn2 = new TreeNode(2, ltn3, ltn4);
//		TreeNode rtn2 = new TreeNode(2, rtn4, rtn3);
//
//		TreeNode root = new TreeNode(1, ltn2, rtn2);
//		
//		System.out.println(t.isSymmetric(root));
		
//		TreeNode ltn3 = new TreeNode(3);
//		TreeNode rtn3 = new TreeNode(3);
//		 
//		TreeNode ltn2 = new TreeNode(2, null, ltn3);
//		TreeNode rtn2 = new TreeNode(2, null, rtn3);
//
//		TreeNode root = new TreeNode(1, ltn2, rtn2);
//		
//		System.out.println(t.isSymmetric(root));
		
//		TreeNode rtn3 = new TreeNode(3);
//		TreeNode ltn2 = new TreeNode(2);
//		TreeNode root = new TreeNode(1, ltn2, rtn3);
		
//		TreeNode rtn3 = new TreeNode(3);
//		TreeNode ltn2 = new TreeNode(2);
//		TreeNode root = new TreeNode(1, ltn2, rtn3);
		
		TreeNode tn1 = new TreeNode(2);
		TreeNode tn2 = new TreeNode(2, tn1, null);
		
		TreeNode tn3 = new TreeNode(2);
		TreeNode tn4 = new TreeNode(2, tn3, null);

		TreeNode root = new TreeNode(1, tn2, tn4);
		
		System.out.println(t.isSymmetric(root));

		
		
	}
}
