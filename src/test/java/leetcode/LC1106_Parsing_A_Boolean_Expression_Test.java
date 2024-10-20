package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1106_Parsing_A_Boolean_Expression_Test {
    LC1106_Parsing_A_Boolean_Expression test = new LC1106_Parsing_A_Boolean_Expression();
    
    @Test
    void test() {
        assertThat(test.parseBoolExpr("&(|(f))")).isEqualTo(false);
        assertThat(test.parseBoolExpr("|(f, f, f, t)")).isEqualTo(true);
        assertThat(test.parseBoolExpr("!(&(f, t))")).isEqualTo(true);
    }
}
