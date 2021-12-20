package leetcode;

public class LC0147_Insertion_Sort_List {
    public ListNode insertionSortList(ListNode head) {
        ListNode i = head;
        while(i != null) {
            ListNode j = i.next;
            while(j != null) {
                if (i.val > j.val) {
                    i.val = i.val ^ j.val;
                    j.val = i.val ^ j.val;
                    i.val = i.val ^ j.val;
                }
                j = j.next;
            }
            i = i.next;
        }
        return head;
    }
}
