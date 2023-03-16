package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0106_Construct_Binary_Tree_from_Inorder_and_Postorder_Test {

    @Test
    void test() {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        LC0106_Construct_Binary_Tree_from_Inorder_and_Postorder test = new LC0106_Construct_Binary_Tree_from_Inorder_and_Postorder();
        TreeNode result1 = test.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
            
        assertThat(result1.val).isEqualTo(3);
        assertThat(result1.left.val).isEqualTo(9);
        assertThat(result1.right.val).isEqualTo(20);
        assertThat(result1.right.left.val).isEqualTo(15);
        assertThat(result1.right.right.val).isEqualTo(7);

        TreeNode result2 = test.buildTree(new int[]{-1}, new int[]{-1});
        assertThat(result2.val).isEqualTo(-1);
    }
}