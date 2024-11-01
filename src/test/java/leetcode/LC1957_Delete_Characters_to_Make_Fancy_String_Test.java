package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1957_Delete_Characters_to_Make_Fancy_String_Test {
    @Test
    void exampleTest() {
        LC1957_Delete_Characters_to_Make_Fancy_String test = new LC1957_Delete_Characters_to_Make_Fancy_String();

        assertThat(test.makeFancyString("leeetcode")).isEqualTo("leetcode");
        assertThat(test.makeFancyString("aaabaaaa")).isEqualTo("aabaa");
        assertThat(test.makeFancyString("aab")).isEqualTo("aab");
    }
}
