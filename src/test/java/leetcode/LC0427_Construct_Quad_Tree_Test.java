package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

class LC0427_Construct_Quad_Tree_Test {

    @Test
    void minimumTotal() {
        LC0427_Construct_Quad_Tree.Node topLeft = new LC0427_Construct_Quad_Tree.Node(false, true);
        LC0427_Construct_Quad_Tree.Node topRight = new LC0427_Construct_Quad_Tree.Node(true, true);
        LC0427_Construct_Quad_Tree.Node bottomLeft = new LC0427_Construct_Quad_Tree.Node(true, true);
        LC0427_Construct_Quad_Tree.Node bottomRight = new LC0427_Construct_Quad_Tree.Node(false, true);
        LC0427_Construct_Quad_Tree.Node root = new LC0427_Construct_Quad_Tree.Node(true, false, topLeft, topRight, bottomLeft, bottomRight);

        LC0427_Construct_Quad_Tree test = new LC0427_Construct_Quad_Tree();
        LC0427_Construct_Quad_Tree.Node result = test.construct(new int[][]{{0, 1}, {1, 0}});

        assertThat(result.isLeaf).isFalse();
        assertThat(Arrays.asList(true, false).contains(result.val)).isTrue();
        assertThat(result.topLeft.isLeaf).isTrue();
        assertThat(result.topLeft.val).isFalse();
        assertThat(result.topRight.isLeaf).isTrue();
        assertThat(result.topRight.val).isTrue();
        assertThat(result.bottomLeft.isLeaf).isTrue();
        assertThat(result.bottomLeft.val).isTrue();
        assertThat(result.bottomRight.isLeaf).isTrue();
        assertThat(result.bottomRight.val).isFalse();
    }

    // public static class Node {
    //     public boolean val;
    //     public boolean isLeaf;
    //     public Node topLeft;
    //     public Node topRight;
    //     public Node bottomLeft;
    //     public Node bottomRight;
    //
    //
    //     public Node() {
    //         this.val = false;
    //         this.isLeaf = false;
    //         this.topLeft = null;
    //         this.topRight = null;
    //         this.bottomLeft = null;
    //         this.bottomRight = null;
    //     }
    //
    //     public Node(boolean val, boolean isLeaf) {
    //         this.val = val;
    //         this.isLeaf = isLeaf;
    //         this.topLeft = null;
    //         this.topRight = null;
    //         this.bottomLeft = null;
    //         this.bottomRight = null;
    //     }
    //
    //     public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
    //         this.val = val;
    //         this.isLeaf = isLeaf;
    //         this.topLeft = topLeft;
    //         this.topRight = topRight;
    //         this.bottomLeft = bottomLeft;
    //         this.bottomRight = bottomRight;
    //     }
    // }
}
