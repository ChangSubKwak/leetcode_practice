package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;
import java.util.stream.*;

import org.junit.jupiter.api.*;

import sun.reflect.generics.tree.*;

class LC0102_Binary_Tree_Level_Order_Traversal_Test {
    LC0102_Binary_Tree_Level_Order_Traversal test = new LC0102_Binary_Tree_Level_Order_Traversal();
    TreeNode one;
    
    @BeforeEach
    void setUp() {
        one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
    }
    
    @Test
    void test() {
        assertThat(test.levelOrder(one)).isEqualTo(Arrays.asList(
            Arrays.asList(1),
            Arrays.asList(2, 3),
            Arrays.asList(4, 5)
        ));
    }
}