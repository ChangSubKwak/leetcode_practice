package leetcode;

public class LC0105_ConstructBinaryTreefromPreorderandInorderTraversal_X {
	public TreeNode executeDetail(int pS, int iS, int iE, int[] po, int[] io) {
		if (pS > po.length - 1 || iS > iE )
			return null;
		
		TreeNode root = new TreeNode(po[pS]);
		
		// finding root-index
		int ri = 0;
		for (int i = iS; i <= iE ; i++) {
			if (io[i] == po[pS]) { 
				ri = i; 
				break; 
			}
		}
		
		root.left  = executeDetail(pS + 1            , iS    , ri - 1, po, io);
		root.right = executeDetail(pS + 1 + (ri - iS), ri + 1, iE    , po, io);
		
		return root;
	}
	
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	return executeDetail(0, 0, inorder.length - 1, preorder, inorder);
    }
	
	public static void main(String[] args) {
		LC0105_ConstructBinaryTreefromPreorderandInorderTraversal_X t = new LC0105_ConstructBinaryTreefromPreorderandInorderTraversal_X();
		TreeNode result = t.buildTree(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7});
		System.out.println(result.constructLevelList());
		//System.out.println(t.buildTree(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7}));
	}
}
