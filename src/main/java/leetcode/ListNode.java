package leetcode;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	public static ListNode setArray(int[] array) {
		if (array.length == 0) return null;
		ListNode l = new ListNode(array[0]);
		ListNode t = l;
		for (int i = 1 ; i < array.length ; i++) {
			l.next = new ListNode(array[i]);
			l = l.next;
		}
		return t;
	}
	
	public static void print(ListNode head) {
		ListNode t = head;
		while(t!=null) {
			if (t.next != null) System.out.print(t.val + " -> ");
			else                System.out.println(t.val);
			t = t.next;
		}
	}
}
