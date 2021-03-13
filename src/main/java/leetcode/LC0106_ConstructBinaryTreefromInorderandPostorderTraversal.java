package leetcode;

public class LC0106_ConstructBinaryTreefromInorderandPostorderTraversal {
	public TreeNode executeDetail(int pi, int iS, int iE, int[] io, int[] po) {
		if (pi < 0 || iS > iE )
			return null;
		
		TreeNode root = new TreeNode(po[pi]);
		
		// finding root-index
		int ri = 0;
		for (int i = iS; i <= iE ; i++) {
			if (io[i] == po[pi]) { 
				ri = i; 
				break; 
			}
		}
		
		root.right = executeDetail(pi - 1             , ri + 1, iE    , io, po);
		root.left  = executeDetail(pi - 1 - (iE - ri) , iS    , ri - 1, io, po);
		
		return root;
	}
	
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	return executeDetail(postorder.length - 1, 0, inorder.length - 1, inorder, postorder);
    }
	
	public static void main(String[] args) {
		LC0106_ConstructBinaryTreefromInorderandPostorderTraversal t = new LC0106_ConstructBinaryTreefromInorderandPostorderTraversal();
		TreeNode result = t.buildTree(new int[] {9,3,15,20,7}, new int[] {9,15,7,20,3});
		System.out.println(result.constructLevelList());
		//System.out.println(t.buildTree(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7}));
	}
}
