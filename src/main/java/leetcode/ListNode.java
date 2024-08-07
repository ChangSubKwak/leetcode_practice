package leetcode;

import java.util.ArrayList;
import java.util.List;

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

	public int[] getArray() {
		List<Integer> list = new ArrayList<>();
		ListNode head = next;
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}

		return list.stream().mapToInt(i -> i).toArray();
	}
	
	public static void print(ListNode head) {
		ListNode t = head;
		while(t!=null) {
			if (t.next != null) System.out.print(t.val + " -> ");
			else                System.out.println(t.val);
			t = t.next;
		}
	}

	public int getLength() {
		int length = 0;

		ListNode head = this;
		while (head != null) {
			length++;
			head = head.next;
		}

		return length;
	}

	@Override
	public boolean equals(Object obj) {
		ListNode source = this;
		ListNode target = (ListNode)obj;

		if (source.getLength() != target.getLength()) {
			return false;
		}

		while (source != null) {
			if (source.val != target.val) {
				return false;
			}
			source = source.next;
			target = target.next;
		}

		return true;
	}

}
