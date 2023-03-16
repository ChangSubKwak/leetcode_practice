package leetcode;

public class LC0106_Construct_Binary_Tree_from_Inorder_and_Postorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return recur(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode recur(int[] inorder, int inorderStart, int inorderEnd, int[] postorder, int postorderStart, int postorderEnd) {
        if (inorderStart > inorderEnd || postorderStart > postorderEnd) {
            return null;
        }

        int rootVal = postorder[postorderEnd];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = 0;
        for (int i = inorderStart; i <= inorderEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        int leftSize  = rootIndex - inorderStart;
        int rightSize = inorderEnd - rootIndex;
        root.left  = recur(inorder, inorderStart, rootIndex - 1, postorder, postorderStart, postorderStart + leftSize - 1);
        root.right = recur(inorder, rootIndex + 1, inorderEnd, postorder, postorderEnd - rightSize, postorderEnd - 1);

        return root;
    }
}
