package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
         ListNode pointer = head;
         while (pointer != null) {
             list.add(0, pointer.val);
             pointer = pointer.next;
         }
         
         if (list.size() <= 1) {
             return head;
         }
         
         pointer = new ListNode(list.get(0));
         head = pointer;
         for (int i = 1; i < list.size(); i++) {
             pointer.next = new ListNode(list.get(i));
             pointer = pointer.next;
         }

         return head;
     }
}
