package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1790_Check_if_One_String_Swap_Can_Make_Strings_Equal_Test {
    LC1790_Check_if_One_String_Swap_Can_Make_Strings_Equal test = new LC1790_Check_if_One_String_Swap_Can_Make_Strings_Equal();

    @Test
    void exampleTest() {
        assertThat(test.areAlmostEqual("bank", "kanb")).isEqualTo(true);
        assertThat(test.areAlmostEqual("attack", "defend")).isEqualTo(false);
        assertThat(test.areAlmostEqual("kelb", "kelb")).isEqualTo(true);
    }
}
