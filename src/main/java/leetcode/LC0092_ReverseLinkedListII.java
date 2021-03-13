package leetcode;

import java.util.LinkedList;

public class LC0092_ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if (m == n) return head;
    	
    	ListNode p = new ListNode(0);
    	p.next = head;
    	
    	ListNode t = p;
    	LinkedList<Integer> list = new LinkedList<>();
    	int idx = 0;
    	while(t!=null) {
    		t = t.next;
    		idx++;
    		if (idx >= m && idx <= n)
    			list.add(t.val);
    		
    	}
    	
    	t = p;
    	idx = 0;
    	while(t!=null) {
    		t = t.next;
    		idx++;
    		if (idx >= m && idx <= n)
    			t.val = list.pollLast();
    	}
    	
        return head;
    }
    
    public ListNode recurseAndReverse2(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0); // create a dummy node to mark the head of this list
        dummy.next = head;
        ListNode pre = dummy; // make a pointer pre as a marker for the node before reversing
        for(int i = 0; i<m-1; i++) pre = pre.next;
        
        ListNode start = pre.next; // a pointer to the beginning of a sub-list that will be reversed
        ListNode then = start.next; // a pointer to a node that will be reversed
        
        // 1 - 2 -3 - 4 - 5 ; m=2; n =4 ---> pre = 1, start = 2, then = 3
        // dummy-> 1 -> 2 -> 3 -> 4 -> 5
        
        for(int i=0; i<n-m; i++)
        {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        
        // first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
        // second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then = 5 (finish)
        ListNode.print(dummy.next);
        return dummy.next;
    }
    
    
	
	public static void main(String[] args) {
		LC0092_ReverseLinkedListII t = new LC0092_ReverseLinkedListII();
//		ListNode l = ListNode.setArray(new int[] {1,2,3,4,5});
		ListNode l = ListNode.setArray(new int[] {3,5});
//		ListNode l = ListNode.setArray(new int[] {1,2,3});
//		ListNode l = ListNode.setArray(new int[] {1,2,3});
		ListNode.print(l);
//		t.reverseBetween(l, 2, 4);
//		t.reverseBetween(l, 1, 2);
		t.recurseAndReverse2(l, 1, 2);
//		t.reverseBetween(l, 2, 3);
//		t.reverseBetween(l, 1, 3);
//		t.recurseAndReverse2(l, 1, 3);
		ListNode.print(l);
	}
}
