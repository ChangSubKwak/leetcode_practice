package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0990_Satisfiability_of_Equality_Equations_Test {
    @Test
    void test() {
        LC0990_Satisfiability_of_Equality_Equations test = new LC0990_Satisfiability_of_Equality_Equations();
        assertThat(test.equationsPossible(new String[]{"a==b", "b!=a"})).isFalse();
        assertThat(test.equationsPossible(new String[]{"b==a", "a==b"})).isTrue();
    }
}