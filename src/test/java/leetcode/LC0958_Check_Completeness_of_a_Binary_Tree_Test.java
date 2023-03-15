package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0958_Check_Completeness_of_a_Binary_Tree_Test {

    @Test
    void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        LC0958_Check_Completeness_of_a_Binary_Tree test = new LC0958_Check_Completeness_of_a_Binary_Tree();
        assertThat(test.isCompleteTree(root)).isTrue();

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        assertThat(test.isCompleteTree(root)).isFalse();
    }
}
