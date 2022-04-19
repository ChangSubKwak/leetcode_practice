package leetcode;

public class LC0099_Recover_Binary_Search_Tree_X {
    TreeNode prev = null;
    TreeNode first = null;
    TreeNode second=null;
    
    void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inorder(root.left);
        if (prev != null && root.val < prev.val) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }
        prev = root;
        inorder(root.right);
    }
    
    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inorder(root);
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
	
	public static void main(String[] args) {
		Integer i = null;
		System.out.println(i);
	}
}
