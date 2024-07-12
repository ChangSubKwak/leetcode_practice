package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1717_Maximum_Score_From_Removing_Substrings_Test {
    LC1717_Maximum_Score_From_Removing_Substrings test = new LC1717_Maximum_Score_From_Removing_Substrings();

    @Test
    void exampleTest() {
        assertThat(test.maximumGain("cdbcbbaaabab", 4, 5)).isEqualTo(19);
        assertThat(test.maximumGain("aabbaaxybbaabb", 5, 4)).isEqualTo(20);
    }
}
