package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LC1399_Count_Largest_Group_Test {
    @Test
    void test() {
        LC1399_Count_Largest_Group test = new LC1399_Count_Largest_Group();

        assertThat(test.countLargestGroup(13)).isEqualTo(4);
        assertThat(test.countLargestGroup(2)).isEqualTo(2);

    }
}
