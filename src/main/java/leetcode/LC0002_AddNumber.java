package main.java.leetcode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l1.next == null)      return l2;
        else if (l2.val == 0 && l2.next == null) return l1;
        
        ListNode prevHead = null, head = null, result = null;
        int carry = 0;
        result = new ListNode();
        while(l1 != null || l2 != null) {
        	int val1 = (l1 == null) ? 0 : l1.val;
        	int val2 = (l2 == null) ? 0 : l2.val;
            result.val = val1 + val2 + carry;

            if (head == null) {
                head = result;
            }
            
            if (result.val >= 10) {
            	result.val -= 10;
            	carry = 1;
            }
            else                  carry = 0;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

            prevHead = result;
            result = new ListNode();
            prevHead.next = result;
        }
        
        if (carry == 0) prevHead.next = null;
        else {
        	result.val = 1;
        }
		
        return head;
    }
}

public class LC0002_AddNumber {
	public static void main(String args[]) {
		ListNode p1 = null, h1 = null, l1 = null;
		ListNode p2 = null, h2 = null, l2 = null;

		l1  = new ListNode();
//		for (int i : new int[]{2, 4, 3} ) {
//		for (int i : new int[]{ 5 } ) {
//		for (int i : new int[]{ 9, 8 } ) {
		for (int i : new int[]{ 0,8,6,5,6,8,3,5,7 } ) {
			l1.val = i;
			if (h1 == null)
				h1 = l1;
			
			p1 = l1;
			l1 = new ListNode();
			p1.next = l1;
		}
		p1.next = null;
		
		l1 = h1;
		while(l1 != null) {
			System.out.print(l1.val + " ");
			l1 = l1.next;
		}
		System.out.println();
		
		l2  = new ListNode();
//		for (int i : new int[]{5, 6, 4} ) {
//		for (int i : new int[]{ 5 } ) {
//		for (int i : new int[]{ 1 } ) {
		for (int i : new int[]{ 6,7,8,0,8,5,8,9,7 } ) {
			l2.val = i;
			if (h2 == null)
				h2 = l2;
			
			p2 = l2;
			l2 = new ListNode();
			p2.next = l2;
		}
		p2.next = null;

		l2 = h2;
		while(l2 != null) {
			System.out.print(l2.val + " ");
			l2 = l2.next;
		}
		System.out.println();
		
		ListNode r = new Solution().addTwoNumbers(h1, h2);
		while(r != null) {
			System.out.print(r.val + " ");
			r = r.next;
		}
		System.out.println();
	}
}
