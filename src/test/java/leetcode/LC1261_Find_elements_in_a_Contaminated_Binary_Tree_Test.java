package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1261_Find_elements_in_a_Contaminated_Binary_Tree_Test {
    
    @Test
    void test1() {
        TreeNode root = new TreeNode(-1);
        root.right = new TreeNode(-1);

        LC1261_Find_elements_in_a_Contaminated_Binary_Tree.FindElements test = new LC1261_Find_elements_in_a_Contaminated_Binary_Tree.FindElements(root);
        assertThat(test.find(1)).isEqualTo(false);
        assertThat(test.find(2)).isEqualTo(true);
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(-1);

        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(-1);

        LC1261_Find_elements_in_a_Contaminated_Binary_Tree.FindElements test = new LC1261_Find_elements_in_a_Contaminated_Binary_Tree.FindElements(root);
        assertThat(test.find(1)).isEqualTo(true);
        assertThat(test.find(3)).isEqualTo(true);
        assertThat(test.find(5)).isEqualTo(false);
    }

    @Test
    void test3() {
        TreeNode root = new TreeNode(-1);
        root.right = new TreeNode(-1);

        root.right.left = new TreeNode(-1);
        root.right.left.left = new TreeNode(-1);

        LC1261_Find_elements_in_a_Contaminated_Binary_Tree.FindElements test = new LC1261_Find_elements_in_a_Contaminated_Binary_Tree.FindElements(root);
        assertThat(test.find(2)).isEqualTo(true);
        assertThat(test.find(3)).isEqualTo(false);
        assertThat(test.find(4)).isEqualTo(false);
        assertThat(test.find(5)).isEqualTo(true);
    }
}
