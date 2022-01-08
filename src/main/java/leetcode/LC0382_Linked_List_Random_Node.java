package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LC0382_Linked_List_Random_Node {
    List<Integer> list;

    public void Solution(ListNode head) {
        list = new LinkedList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        return list.get((int)(Math.random() * list.size()));
    }
}
