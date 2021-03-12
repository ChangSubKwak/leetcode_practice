package main.java.leetcode;

public class LC0082_RemoveDuplicatesfromSortedList {
	/*
	ListNode head;
	ListNode p;
	ListNode c;
	ListNode n;
	
	public void deleteHead() {
		ListNode t = c;
		c = c.next;
		if (n != null) n = n.next;
		head = c;
		t = null;
	}
	
	public void deleteMiddle() {
		p.next = n;
		ListNode t = c;
		c = c.next;
		if (n != null) n = n.next;
		t = null;
	}
	
    public ListNode deleteDuplicates(ListNode head) {
    	if (head == null) return null;
    	
    	this.head = head;
    	p = null;
    	c = head;
    	n = head.next;
    	
    	boolean onDel = false;
    	while(n != null) {
    		if (c.val == n.val) {
    			onDel = true;
    		} else if (onDel) {
    			if (c == this.head) deleteHead(); 
    			else           deleteMiddle();
    			onDel = false;
    			continue;
    		}
    		
    		if (onDel) {
    			if (c == this.head) deleteHead();
    			else           deleteMiddle();
    		} else {
    			p = c; c = c.next; n = n.next;
    		}
    	}
    	
    	if (onDel) {
			if (c == this.head) deleteHead();
			else                deleteMiddle();
    	}
    	
        return this.head;
    }
    */
	
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) return null;
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		
		ListNode p = dummy;
		ListNode c = head;
		while(c != null) {
			while(c.next != null && c.val == c.next.val) c = c.next;
			if (p.next == c) p = c;
			else             p.next = c.next;
			c = c.next;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		LC0082_RemoveDuplicatesfromSortedList t = new LC0082_RemoveDuplicatesfromSortedList();
//		int[] arr = new int[] {1, 2, 2};
//		int[] arr = new int[] {1, 1};
//		int[] arr = new int[] {};
//		int[] arr = new int[] {1,2,3,3,4,4,5};
		int[] arr = new int[] {1,1,1,2,3};
		ListNode l = ListNode.setArray(arr);
		ListNode.print(l);
		l = t.deleteDuplicates(l);
		ListNode.print(l);
	}
}
