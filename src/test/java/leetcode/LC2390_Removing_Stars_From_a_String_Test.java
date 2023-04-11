package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2390_Removing_Stars_From_a_String_Test {
    @Test
    void exampleTest() {
        LC2390_Removing_Stars_From_a_String  test = new LC2390_Removing_Stars_From_a_String();
        assertThat(test.removeStars("leet**cod*e")).isEqualTo("lecoe");
        assertThat(test.removeStars("erase*****")).isEqualTo("");
    }
}
