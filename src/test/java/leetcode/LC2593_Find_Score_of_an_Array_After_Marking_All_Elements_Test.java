package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2593_Find_Score_of_an_Array_After_Marking_All_Elements_Test {
    @Test
    void test() {
        LC2593_Find_Score_of_an_Array_After_Marking_All_Elements test = new LC2593_Find_Score_of_an_Array_After_Marking_All_Elements();

        assertThat(test.findScore(new int[]{2, 1, 3, 4, 5, 2})).isEqualTo(7);
        assertThat(test.findScore(new int[]{2, 3, 5, 1, 3, 2})).isEqualTo(5);
    }
}
