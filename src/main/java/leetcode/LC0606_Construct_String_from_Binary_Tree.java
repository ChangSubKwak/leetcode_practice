package leetcode;

public class LC0606_Construct_String_from_Binary_Tree {
    private StringBuilder sb;
    
    private void recursive(TreeNode root) {
        if (root == null) {
            return;
        }
        sb.append(root.val);
        
        if (root.left == null && root.right == null) {
            return;
        }
        sb.append("(");
        recursive(root.left);
        sb.append(")");
        
        if (root.right == null) {
            return;
        }
        sb.append("(");
        recursive(root.right);
        sb.append(")");
    }
    
    public String tree2str(TreeNode root) {
        sb = new StringBuilder();
        recursive(root);
        return sb.toString();
    }
}
