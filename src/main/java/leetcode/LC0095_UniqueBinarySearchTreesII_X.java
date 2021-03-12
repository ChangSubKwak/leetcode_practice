package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0095_UniqueBinarySearchTreesII_X {
	public List<TreeNode> recursive(int s, int e) {
		List<TreeNode> list = new ArrayList<>();
		
		if (s > e) {
			list.add(null);
			return list;
		}
		
		if (s == e) {
			list.add(new TreeNode(s));
			return list;
		}
		
		List<TreeNode> left,right;
        for(int i = s; i <= e ; i++ ) {
            
            left  = recursive(s, i - 1);
            right = recursive(i + 1, e);
            
            for(TreeNode lnode: left) {
                for(TreeNode rnode: right) {
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    list.add(root);
                }
            }
        }
		return list;
	}
	
    public List<TreeNode> generateTrees(int n) {
        return recursive(1, n);
    }
	
	public static void main(String[] args) {
		LC0095_UniqueBinarySearchTreesII_X t = new LC0095_UniqueBinarySearchTreesII_X();
		for (int i = 0 ; i <= 10 ; i++)
			System.out.println(t.generateTrees(i).size());
		//System.out.println(t.generateTrees(3));
//		for (TreeNode i : t.generateTrees(3)) {
//			System.out.println(i);
//		}
	}
}
