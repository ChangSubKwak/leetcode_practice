package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2185_Counting_Words_With_a_Given_Prefix_Test {

    private LC2185_Counting_Words_With_a_Given_Prefix test = new LC2185_Counting_Words_With_a_Given_Prefix();

    @Test
    void exampleTest1() {
        assertThat(test.prefixCount(new String[]{"pay", "attention", "practice", "attend"}, "at")).isEqualTo(2);
        assertThat(test.prefixCount(new String[]{"leetcode", "win", "loops", "success"}, "code")).isEqualTo(0);
    }
}