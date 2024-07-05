package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2058_Find_the_Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points_Test {
    @Test
    void exampleTest() {
        LC2058_Find_the_Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points test = new LC2058_Find_the_Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points();

        ListNode head = ListNode.setArray(new int[]{3, 1});
        assertThat(test.nodesBetweenCriticalPoints(head)).isEqualTo(new int[]{-1, -1});

        head = ListNode.setArray(new int[]{5, 3, 1, 2, 5, 1, 2});
        assertThat(test.nodesBetweenCriticalPoints(head)).isEqualTo(new int[]{1, 3});

        head = ListNode.setArray(new int[]{1, 3, 2, 2, 3, 2, 2, 2, 7});
        assertThat(test.nodesBetweenCriticalPoints(head)).isEqualTo(new int[]{3, 3});
    }
}
