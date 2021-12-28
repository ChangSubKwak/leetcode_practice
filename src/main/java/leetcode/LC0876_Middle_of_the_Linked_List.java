package leetcode;

public class LC0876_Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size = 0;
        
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        
        size /= 2;
        
        temp = head;
        for (int i = 0; i < size; i++) {
            temp = temp.next;
        }
        
        return temp;
    }
}
