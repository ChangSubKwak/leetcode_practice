package leetcode;

import java.math.BigDecimal;

public class LC0445_Add_Two_Numbers_II {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        StringBuilder sb1 = new StringBuilder();
        while (temp != null) {
            sb1.append(temp.val);
            temp = temp.next;
        }
        
        StringBuilder sb2 = new StringBuilder();
        temp = l2;
        while (temp != null) {
            sb2.append(temp.val);
            temp = temp.next;
        }
        
        BigDecimal bd1 = new BigDecimal(sb1.toString());
        BigDecimal bd2 = new BigDecimal(sb2.toString());
        BigDecimal bd3 = bd1.add(bd2);
        
        StringBuilder sb3 = new StringBuilder(bd3.toString());
        
        ListNode result = new ListNode();
        ListNode head = new ListNode();
        head = result;
        for (char c : sb3.toString().toCharArray()) {
            result.next = new ListNode(c - '0');
            result = result.next;
        }
        System.gc();
        return head.next;
    }
}