package leetcode;

public class LC0083_RemoveDuplicatesfromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) return null;
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		
		ListNode p = dummy;
		ListNode c = head;
		while(c != null) {
			while(c.next != null && c.val == c.next.val)
				c = c.next;
			
			if (p.next == c) p = c;
			else             {
				p.next = c;
				p = p.next;
			}
			
			c = c.next;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		LC0083_RemoveDuplicatesfromSortedListII t = new LC0083_RemoveDuplicatesfromSortedListII();
		//int[] arr = new int[] {1,1,2,3,3};
		int[] arr = new int[] {1,1,2};
		ListNode l = ListNode.setArray(arr);
		ListNode.print(l);
		l = t.deleteDuplicates(l);
		ListNode.print(l);
	}
}
