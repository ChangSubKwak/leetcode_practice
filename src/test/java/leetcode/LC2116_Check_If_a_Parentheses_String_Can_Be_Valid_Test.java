package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2116_Check_If_a_Parentheses_String_Can_Be_Valid_Test {
    @Test
    void exampleTest() {
        LC2116_Check_If_a_Parentheses_String_Can_Be_Valid test = new LC2116_Check_If_a_Parentheses_String_Can_Be_Valid();
        
        assertThat(test.canBeValiid("))()))", "010100")).isEqualTo(true);
        assertThat(test.canBeValiid("()()", "0000")).isEqualTo(true);
        assertThat(test.canBeValiid(")", "0")).isEqualTo(false);
    }
}
