package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0814_Binary_Tree_Pruning_Test {
    
    LC0814_Binary_Tree_Pruning test;
    
    @BeforeEach
    void setUp() {
        test = new LC0814_Binary_Tree_Pruning();
    }
    
    @Test
    void test() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        TreeNode result = new TreeNode(1);
        result.right = new TreeNode(0);
        result.right.right = new TreeNode(1);
        assertThat(test.pruneTree(root)).isEqualTo(result);
    }
}
