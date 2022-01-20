package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC0142_Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode temp = head;
        while(true) {
            if (temp == null) {
                return null;
            }
            
            if (set.contains(temp)) {
                break;
            }
            
            set.add(temp);
            temp = temp.next;
        }
        
        return temp;
    }
}
