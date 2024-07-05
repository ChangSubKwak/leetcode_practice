package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC2058_Find_the_Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp = head;
        List<Integer> criticalPoints = new ArrayList<>();
        int i = 0;

        while (temp.next.next != null) {
            ListNode left = temp;
            ListNode middle = temp.next;
            ListNode right = temp.next.next;
            i += 1;

            if (left.val < middle.val && middle.val > right.val) {
                criticalPoints.add(i);
                temp = temp.next;
                continue;
            }

            if (left.val > middle.val && middle.val < right.val) {
                criticalPoints.add(i);
            }
            temp = temp.next;
        }

        if (criticalPoints.size() < 2) {
            return new int[]{-1, -1};
        }

        int max = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);
        int min = 100000;

        for (int j = 0; j < criticalPoints.size() - 1; j++) {
            int difference = criticalPoints.get(j + 1) - criticalPoints.get(j);
            if (min > difference) {
                min = difference;
            }
        }

        return new int[]{min, max};
    }
}
