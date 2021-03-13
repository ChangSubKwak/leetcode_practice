package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0109_ConvertSortedListtoBinarySearchTree {
	public TreeNode constructBST(int[] nums, int l, int r) {
		if (l > r) return null;
		
		int m = l + (r - l) / 2;
		
		TreeNode n = new TreeNode(nums[m]);
		n.left  = constructBST(nums, l, m - 1);
		n.right = constructBST(nums, m + 1, r);
		return n;
	}
	
    public TreeNode sortedListToBST(ListNode head) {
    	if (head == null) return null;
    	
    	int[] nums;
    	List<Integer> list = new ArrayList<Integer>();
    	
    	while (head != null) {
    		list.add(head.val);
    		head = head.next;
    	}
    	nums = list.stream().mapToInt(i->i).toArray();
    	
        return constructBST(nums, 0, nums.length - 1);
    }
	
	public static void main(String[] args) {
		LC0109_ConvertSortedListtoBinarySearchTree t = new LC0109_ConvertSortedListtoBinarySearchTree();
		
		ListNode head = new ListNode(-10);
		ListNode temp = head;
		temp.next = new ListNode(-3); temp = temp.next;
		temp.next = new ListNode( 0); temp = temp.next;
		temp.next = new ListNode( 5); temp = temp.next;
		temp.next = new ListNode( 9);
		
		ListNode.print(head);
		
		System.out.println(t.sortedListToBST(head).constructLevelList());
//		System.out.println(t.sortedArrayToBST(new ListNode(0)).constructLevelList());
//		System.out.println(t.sortedArrayToBST(new ListNode(0)).constructLevelList());
	}
}
