package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0199_BinaryTreeRightSideView {
	List<Integer> list = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
    	
        return result;
    }

	public static void main(String[] args) {
		LC0199_BinaryTreeRightSideView t = new LC0199_BinaryTreeRightSideView();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		
		t1.left = t2;
		t1.right = t3;
		t2.right = t5;
		t3.right = t4;
		
		System.out.println(t.rightSideView(t1));
	}
}
