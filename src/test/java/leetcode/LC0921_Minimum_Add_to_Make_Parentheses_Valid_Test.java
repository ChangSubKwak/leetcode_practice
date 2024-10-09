package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0921_Minimum_Add_to_Make_Parentheses_Valid_Test {
    @Test
    void test() {
        LC0921_Minimum_Add_to_Make_Parentheses_Valid test = new LC0921_Minimum_Add_to_Make_Parentheses_Valid();

        assertThat(test.minAddToMakeValid("())")).isEqualTo(1);
        assertThat(test.minAddToMakeValid("(((")).isEqualTo(3);
    }
}
