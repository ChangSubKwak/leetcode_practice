package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3330_Find_the_Original_Typed_String_I_Test {
    @Test
    void test() {
        LC3330_Find_the_Original_Typed_String_I test = new LC3330_Find_the_Original_Typed_String_I();

        assertThat(test.possibleStringCount("abbcccc")).isEqualTo(5);
        assertThat(test.possibleStringCount("abcd")).isEqualTo(1);
        assertThat(test.possibleStringCount("aaaa")).isEqualTo(4);
    }
}
