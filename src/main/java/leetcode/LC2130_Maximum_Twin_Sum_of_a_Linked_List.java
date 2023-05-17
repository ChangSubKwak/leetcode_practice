package leetcode;

public class LC2130_Maximum_Twin_Sum_of_a_Linked_List {
    public int pairSum(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int[] num = new int[length / 2];
        temp = head;
        for (int i = 0; i < length / 2; i++) {
            num[i] += temp.val;
            temp = temp.next;
        }

        for (int i = length / 2 - 1; i >= 0; i--) {
            num[i] += temp.val;
            temp = temp.next;
        }

        int max = 0;
        for (int i = 0; i < length / 2; i++) {
            max = Math.max(max, num[i]);
        }

        return max;
    }
}
