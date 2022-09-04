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
    }
}