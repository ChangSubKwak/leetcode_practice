package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0889_Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal_Test {
    @Test
    void test1() {
        LC0889_Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal test = new LC0889_Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal();

        TreeNode result = new TreeNode(1);
        result.left = new TreeNode(2);
        result.right = new TreeNode(3);

        result.left.left = new TreeNode(4);
        result.left.right = new TreeNode(5);
        result.right.left = new TreeNode(6);
        result.right.right = new TreeNode(7);

        assertThat(test.constructFromPrePost(new int[]{1, 2, 4, 5, 3, 6, 7}, new int[]{4, 5, 2, 6, 7, 3, 1})).isEqualTo(result);
    }

    @Test
    void test2() {
        LC0889_Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal test = new LC0889_Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal();

        TreeNode result = new TreeNode(1);
        assertThat(test.constructFromPrePost(new int[]{1}, new int[]{1})).isEqualTo(result);
    }
}
