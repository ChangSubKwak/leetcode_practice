package leetcode;

public class LC0606_Construct_String_from_Binary {
    private String recur(TreeNode root) {
        String temp = String.valueOf(root.val);

        if (root.left == null && root.right != null) {
            temp += "()";
        }

        if (root.left != null) {
            temp += "(" + recur(root.left) + ")";
        }

        if (root.right != null) {
            temp += "(" + recur(root.right) + ")";
        }

        return temp;
    }

    public String tree2str(TreeNode root) {
        return recur(root);
    }
}
