package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC0108_Convert_Sorted_Array_to_Binary_Search_Tree_Test {
    LC0108_Convert_Sorted_Array_to_Binary_Search_Tree test = new LC0108_Convert_Sorted_Array_to_Binary_Search_Tree();
    TreeNode one;
    TreeNode three;
    
    @BeforeEach
    void setUp() {
        one = new TreeNode(1);
        three = new TreeNode(3);
    }
    
    @Test
    void test() {
        one.right = three;
        boolean case1 = test.sortedArrayToBST(new int[] {1, 3}).equals(one);
        
        one.right = null;
        three.left = one;
        boolean case2 = test.sortedArrayToBST(new int[] {1, 3}).equals(three);
        
        assertThat(case1 || case2).isTrue();
    }
}