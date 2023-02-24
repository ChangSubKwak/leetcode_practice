package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0226_Invert_Binary_Test {
    @Test
    void test() {
        LC0226_Invert_Binary test = new LC0226_Invert_Binary();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode answer = new TreeNode(4);
        answer.left = new TreeNode(7);
        answer.right = new TreeNode(2);
        answer.left.left = new TreeNode(9);
        answer.left.right = new TreeNode(6);
        answer.right.left = new TreeNode(3);
        answer.right.right = new TreeNode(1);

        assertThat(test.invertTree(root)).isEqualTo(answer);
    }
}
