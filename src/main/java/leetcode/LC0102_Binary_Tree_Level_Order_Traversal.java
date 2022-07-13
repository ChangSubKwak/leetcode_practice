package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0102_Binary_Tree_Level_Order_Traversal {
	List<List<Integer>> result;

	private void recursive(TreeNode root, int depth) {
		if (root == null) {
			return;
		}

		if (result.size() < depth) {
			result.add(new ArrayList<>());
		}

		result.get(depth - 1).add(root.val);
		recursive(root.left, depth + 1);
		recursive(root.right, depth + 1);
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		result = new ArrayList<>();
		recursive(root, 1);
		return result;
	}

	/*
	public int getDepth(TreeNode root, int depth) {
		if (root == null) return depth;
		return Math.max(getDepth(root.left, depth+1), getDepth(root.right, depth+1));
	}

	public void inorder(TreeNode root, List<List<Integer>> list, int depth) {
		if (root == null) return ;
		inorder(root.left , list, depth + 1);

		list.get(depth-1).add(root.val);

		inorder(root.right, list, depth + 1);
	}

    public List<List<Integer>> levelOrder(TreeNode root) {
    	if (root==null)
    		return new ArrayList<>();

    	int depth = getDepth(root, 1);
//    	System.out.println(depth);
    	List<List<Integer>> list = new ArrayList<>();
    	for (int i = 0 ; i < depth ; i++)
    		list.add(new ArrayList<Integer>());
    	inorder(root, list, 1);

    	for (int i = 0 ; i < list.size() ; i++) {
    		if (list.get(i).size() == 0) {
    			list.remove(i);
    			i--;
    		}
    	}

    	return list;
    }
    */
	
	public static void main(String[] args) {
		LC0102_Binary_Tree_Level_Order_Traversal t = new LC0102_Binary_Tree_Level_Order_Traversal();
		TreeNode tn15 = new TreeNode(15);
		TreeNode tn7  = new TreeNode(7);
		TreeNode tn20 = new TreeNode(20, tn15, tn7);
		TreeNode tn9  = new TreeNode(9);
		TreeNode root = new TreeNode(3, tn9, tn20);
		System.out.println(t.levelOrder(root));
		
		TreeNode root2 = new TreeNode(1);
		System.out.println(t.levelOrder(root2));
		
		TreeNode root3 = null;
		System.out.println(t.levelOrder(root3));
		
		// [2,null,3,null,4,null,5,null,6]
	}
}
