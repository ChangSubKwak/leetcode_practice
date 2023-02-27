package leetcode;

public class LC0427_Construct_Quad_Tree {
    
    public Node construct(int[][] grid) {
        return recur(grid, 0, 0, grid.length);
    }

    public Node recur(int[][] grid, int x, int y, int len) {
        if (len == 1) {
            return new Node(grid[x][y] != 0, true, null, null, null, null);
        }
        
        Node result = new Node();
        Node topLeft  = recur(grid, x, y, len / 2);
        Node topRight = recur(grid, x, y + len / 2, len / 2);
        Node bottomLeft  = recur(grid, x + len / 2, y, len / 2);
        Node bottomRight  = recur(grid, x + len / 2, y + len / 2, len / 2);
        
        if (isLeafAndEqual(topLeft, topRight, bottomLeft, bottomRight)) {
            result.isLeaf = true;
            result.val = topLeft.val;
        } else {
            result.topLeft     = topLeft;
            result.topRight    = topRight;
            result.bottomLeft  = bottomLeft;
            result.bottomRight = bottomRight;
        }

        return result;
    }

    private boolean isLeafAndEqual(Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        boolean isAllLeaf = topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf;
        boolean isAllEqual = topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val;

        return isAllLeaf && isAllEqual;
    }

    //*
    public static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }

    //*/
}
