package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3333_Find_the_Original_Typed_String_II_Test {
    @Test
    void test() {
        LC3333_Find_the_Original_Typed_String_II test = new LC3333_Find_the_Original_Typed_String_II();

        assertThat(test.possibleStringCount("aabbccdd", 7)).isEqualTo(5);
        assertThat(test.possibleStringCount("aabbccdd", 8)).isEqualTo(1);
        assertThat(test.possibleStringCount("aaabbb", 3)).isEqualTo(8);
    }
}
