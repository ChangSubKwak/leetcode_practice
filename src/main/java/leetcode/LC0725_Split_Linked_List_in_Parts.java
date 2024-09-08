package leetcode;

public class LC0725_Split_Linked_List_in_Parts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode cur = head;
        int N = 0;
        while (cur != null) {
            cur = cur.next;
            N++;
        }

        int width = N / k, rem = N % k;

        ListNode[] ans = new ListNode[k];
        cur = head;
        for (int i = 0; i < k; ++i) {
            ListNode tempHead = new ListNode(0);
            ListNode write = tempHead;
            for (int j = 0; j < width + (i < rem ? 1 : 0); ++j) {
                write = write.next = new ListNode(cur.val);
                if (cur != null) cur = cur.next;
            }
            ans[i] = tempHead.next;
        }
        return ans;
    }
}
