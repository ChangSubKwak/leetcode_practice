package leetcode;

public class LC0002_Add_Number {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode head = res;
        
        int carry = 0;
        while(l1 != null && l2 != null) {
            res.next = new ListNode();
            res.next.val = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            
            res = res.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while (l1 != null) {
            res.next = new ListNode();
            res.next.val = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            
            res = res.next;
            l1 = l1.next;
        }
        
        while (l2 != null) {
            res.next = new ListNode();
            res.next.val = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            
            res = res.next;
            l2 = l2.next;
        }
        
        if (carry > 0) {
            res.next = new ListNode();
            res.next.val = carry;
        }
        
        return head.next;
    }
	
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
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
