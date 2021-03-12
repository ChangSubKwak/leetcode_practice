package main.java.leetcode;

public class LC0105_ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	
    	int root = preorder[0];
    	
    	
    	return null;
    }
	
	public static void main(String[] args) {
		LC0105_ConstructBinaryTreefromPreorderandInorderTraversal t = new LC0105_ConstructBinaryTreefromPreorderandInorderTraversal();
		System.out.println(t.buildTree(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7}));
	}
}
