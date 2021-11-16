package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0141_LinkedListCycle {
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
}
