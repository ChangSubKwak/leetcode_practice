package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC0104_Maximum_Depth_of_Binary_Test {

    @Test
    void test() {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        LC0104_Maximum_Depth_of_Binary test = new LC0104_Maximum_Depth_of_Binary();
        assertThat(test.maxDepth(root1)).isEqualTo(3);

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        assertThat(test.maxDepth(root2)).isEqualTo(2);
    }
}