package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

import sun.reflect.generics.tree.*;

class LC0987_Vertical_Order_Traversal_of_a_Binary_Tree_Test {
    LC0987_Vertical_Order_Traversal_of_a_Binary_Tree test = new LC0987_Vertical_Order_Traversal_of_a_Binary_Tree();
    @Test
    void test() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertThat(test.verticalTraversal(root)).isEqualTo(Arrays.asList(
            Arrays.asList(9),
            Arrays.asList(3, 15),
            Arrays.asList(20),
            Arrays.asList(7)
        ));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        assertThat(test.verticalTraversal(root)).isEqualTo(Arrays.asList(
            Arrays.asList(4),
            Arrays.asList(2),
            Arrays.asList(1, 5, 6),
            Arrays.asList(3),
            Arrays.asList(7)
        ));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        assertThat(test.verticalTraversal(root)).isEqualTo(Arrays.asList(
            Arrays.asList(4),
            Arrays.asList(2),
            Arrays.asList(1, 5, 6),
            Arrays.asList(3),
            Arrays.asList(7)
        ));

        root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(2);

        assertThat(test.verticalTraversal(root)).isEqualTo(Arrays.asList(
            Arrays.asList(0),
            Arrays.asList(1),
            Arrays.asList(3, 2, 2),
            Arrays.asList(4)
        ));
    }
}