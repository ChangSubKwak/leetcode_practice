package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0951_Flip_Equivalent_Binary_Trees_Test {
    LC0951_Flip_Equivalent_Binary_Trees test = new LC0951_Flip_Equivalent_Binary_Trees();

    @Test
    void test1() {
        TreeNode root1 = new TreeNode(1);

        root1.left =  new TreeNode(2);
        root1.right =  new TreeNode(3);
        root1.left.left =  new TreeNode(4);
        root1.left.right =  new TreeNode(5);
        root1.left.right.left =  new TreeNode(7);
        root1.left.right.right =  new TreeNode(8);
        root1.right.left =  new TreeNode(6);

        TreeNode root2 = new TreeNode(1);
        root2.left =  new TreeNode(3);
        root2.right =  new TreeNode(2);
        root2.left.right =  new TreeNode(6);
        root2.right.left =  new TreeNode(4);
        root2.right.right =  new TreeNode(5);
        root2.right.right.left =  new TreeNode(8);
        root2.right.right.right =  new TreeNode(7);

        assertThat(test.flipEquiv(root1, root2)).isTrue();
    }

    @Test
    void test2() {
        TreeNode root1 = new TreeNode();
        TreeNode root2 = new TreeNode();
        assertThat(test.flipEquiv(root1, root2)).isTrue();
    }

    @Test
    void test3() {
        TreeNode root1 = new TreeNode();
        TreeNode root2 = new TreeNode(1);
        assertThat(test.flipEquiv(root1, root2)).isFalse();
    }
}
