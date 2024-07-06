package leetcode;

public class LC2181_Merge_Nodes_in_Between_Zeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;

        while (temp.next != null) {
            if (temp.val == 0) {
                ListNode start = temp.next;
                int sum = 0;

                temp = temp.next;
                while (temp.val != 0) {
                    sum += temp.val;
                    temp = temp.next;
                }

                start.val = sum;
                start.next = temp;

                continue;
            }

            temp = temp.next;
        }

        temp = head;

        ListNode result = new ListNode();
        ListNode answer = result;
        ListNode previous = null;

        while (temp.next != null) {
            if (temp.val != 0) {
                result.val = temp.val;
                result.next = new ListNode();

                previous = result;
                result = result.next;
            }

            temp = temp.next;
        }
        previous.next = null;

        return answer;
    }
}