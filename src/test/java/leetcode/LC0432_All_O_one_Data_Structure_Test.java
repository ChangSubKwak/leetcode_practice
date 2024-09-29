package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0432_All_O_one_Data_Structure_Test {

    @Test
    void test() {
        LC0432_All_O_one_Data_Structure.AllOne test = new LC0432_All_O_one_Data_Structure.AllOne();

        test.inc("hello");
        test.inc("hello");
        assertThat(test.getMaxKey()).isEqualTo("hello");
        assertThat(test.getMinKey()).isEqualTo("hello");

        test.inc("leet");
        assertThat(test.getMaxKey()).isEqualTo("hello");
        assertThat(test.getMinKey()).isEqualTo("leet");
    }
}
