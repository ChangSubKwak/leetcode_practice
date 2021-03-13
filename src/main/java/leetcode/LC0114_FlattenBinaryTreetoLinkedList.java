package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0114_FlattenBinaryTreetoLinkedList {
	public static List<Integer> list;
	
	public void traverse(TreeNode root) {
		if (root == null) return;
		
		list.add(root.val);
		traverse(root.left);
		traverse(root.right);
	}
	
    public void flatten(TreeNode root) {
    	if (root == null)
    		return;
    	
    	list = new ArrayList<>();
        traverse(root);
        //System.out.println(list);
        TreeNode temp = root;
        temp.val = list.get(0);
    	
        for (int i = 1 ; i < list.size() ; i++) {
        	temp.left = null;
        	temp.right = new TreeNode(list.get(i));
        	temp = temp.right;
        }
    }
	
	public static void main(String[] args) {
		LC0114_FlattenBinaryTreetoLinkedList t = new LC0114_FlattenBinaryTreetoLinkedList();
		
		TreeNode root = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		
		root.left = t2;
		root.right = t5;
		t2.left = t3;
		t2.right = t4;
		t5.right = t6;
		
		System.out.println(root.constructLevelList());
		t.flatten(root);
		System.out.println(root.constructLevelList());

	}
}
