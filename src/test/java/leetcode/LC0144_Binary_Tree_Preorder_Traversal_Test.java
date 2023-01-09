package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC0144_Binary_Tree_Preorder_Traversal_Test {
    @Test
    void test() {
        LC0144_Binary_Tree_Preorder_Traversal test = new LC0144_Binary_Tree_Preorder_Traversal();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        assertThat(test.preorderTraversal(root)).isEqualTo(Arrays.asList(1, 2, 3));

        root = null;
        assertThat(test.preorderTraversal(root)).isEqualTo(Arrays.asList());

        root = new TreeNode(1);
        assertThat(test.preorderTraversal(root)).isEqualTo(Arrays.asList(1));
    }
}
