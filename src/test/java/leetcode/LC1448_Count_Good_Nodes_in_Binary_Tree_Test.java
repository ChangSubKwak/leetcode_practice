package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class LC1448_Count_Good_Nodes_in_Binary_Tree_Test {
    LC1448_Count_Good_Nodes_in_Binary_Tree test;

    @BeforeEach
    void setUp() {
        test = new LC1448_Count_Good_Nodes_in_Binary_Tree();
    }

    @Test
    void test() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);
        Assertions.assertThat(test.goodNodes(root)).isEqualTo(4);

        root = new TreeNode(3);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        Assertions.assertThat(test.goodNodes(root)).isEqualTo(3);

        root = new TreeNode(1);
        Assertions.assertThat(test.goodNodes(root)).isEqualTo(1);
    }
}
