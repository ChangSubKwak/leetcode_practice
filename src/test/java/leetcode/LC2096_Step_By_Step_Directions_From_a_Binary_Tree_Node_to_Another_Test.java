package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2096_Step_By_Step_Directions_From_a_Binary_Tree_Node_to_Another_Test {
    LC2096_Step_By_Step_Directions_From_a_Binary_Tree_Node_to_Another test = new LC2096_Step_By_Step_Directions_From_a_Binary_Tree_Node_to_Another();

    @Test
    void exampleTest1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(4);

        assertThat(test.getDirections(root, 3, 6)).isEqualTo("UURL");
    }

    @Test
    void exampleTest2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);

        assertThat(test.getDirections(root, 2, 1)).isEqualTo("L");
    }
}
