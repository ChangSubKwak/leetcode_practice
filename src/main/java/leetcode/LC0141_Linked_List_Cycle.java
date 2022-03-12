package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0141_Linked_List_Cycle {
	// 2022.03.08
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        List<ListNode> list = new ArrayList<>();
        while(head != null) {
            if (!list.contains(head)) {
                list.add(head);
            } else {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    /*
    public boolean hasCycle(ListNode head) {
        List<ListNode> visited = new ArrayList<>();
        while(true) {
            if (head == null) {
                return false;
            }
            if (visited.contains(head)) {
                return true;
            }
            visited.add(head);
            head = head.next;
        }
    }
    */
}
