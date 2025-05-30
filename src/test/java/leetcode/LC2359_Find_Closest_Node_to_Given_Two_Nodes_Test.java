package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2359_Find_Closest_Node_to_Given_Two_Nodes_Test {

    @Test
    void exampleTest() {
        LC2359_Find_Closest_Node_to_Given_Two_Nodes test = new LC2359_Find_Closest_Node_to_Given_Two_Nodes();

        assertThat(test.closestMeetingNode(new int[]{2, 2, 3, -1}, 0, 1)).isEqualTo(2);
        assertThat(test.closestMeetingNode(new int[]{1, 2, -1}, 0, 2)).isEqualTo(2);
    }
}
