package leetcode;

import java.util.*;

public class LC0019_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	List<ListNode> l = new ArrayList<>();
    	
    	int idx = 0;
    	ListNode temp = head;
    	ListNode prev = null;
    	while(true) {
    		if (temp == null) break;
    		l.add(temp);
    		temp = temp.next;
    	}
    	
    	if (l.size() == 1)
    		return null;
    	
    	idx = l.size() - n;
    	
    	if (idx == 0) {
    		temp = l.get(idx);
    		temp.val = temp.next.val;
    		temp.next = temp.next.next;
    		head = temp;
    	} else if (idx == l.size() - 1) {
    		prev = l.get(idx - 1);
    		prev.next = null;
    	} else {
    		prev = l.get(idx - 1);
    		temp = l.get(idx);
    		prev.next = temp.next;
    		temp = null;
    	}
    	
        return head;
    }
	
	public static void main(String[] args) {
		LC0019_RemoveNthNodeFromEndOfList lc = new LC0019_RemoveNthNodeFromEndOfList();

		/*
		ListNode ln5 = new ListNode(5);
		ListNode ln4 = new ListNode(4, ln5);
		ListNode ln3 = new ListNode(3, ln4);
		ListNode ln2 = new ListNode(2, ln3);
		ListNode ln1 = new ListNode(1, ln2);

//		ListNode ln = lc.removeNthFromEnd(ln1, 2);
//		ListNode ln = lc.removeNthFromEnd(ln1, 1);
		ListNode ln = lc.removeNthFromEnd(ln1, 5);
		//*/
		
		ListNode ln1 = new ListNode(1, null);
		ListNode ln = lc.removeNthFromEnd(ln1, 1);
		
		while(true) {
			if (ln == null) break;
			System.out.println(ln.val);
			ln = ln.next;

		}
	}
}
