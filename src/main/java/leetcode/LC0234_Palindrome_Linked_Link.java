package leetcode;

import java.util.*;

public class LC0234_Palindrome_Linked_Link {
    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        if (list.size() == 1) {
            return true;
        }

        if (list.size() == 2 && list.get(0) == list.get(1)) {
            return true;
        }
        else if (list.size() == 2 && list.get(0) != list.get(1)) {
            return false;
        }

        int halfSize = list.size() / 2 + (list.size() % 2 == 0 ? 1 : 0);

        for (int i = 0; i < halfSize; i++) {
            if (list.get(i) != list.get(list.size() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
