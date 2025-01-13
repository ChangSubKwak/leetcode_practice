package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3223_Minimum_Length_of_String_After_Operations_Test {
    @Test
    void test() {
        LC3223_Minimum_Length_of_String_After_Operations test = new LC3223_Minimum_Length_of_String_After_Operations();

        assertThat(test.minimumLength("abaacbcbb")).isEqualTo(5);
        assertThat(test.minimumLength("aa")).isEqualTo(2);
    }
}
