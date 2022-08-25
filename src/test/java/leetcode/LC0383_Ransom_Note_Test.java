package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0383_Ransom_Note_Test {
    LC0383_Ransom_Note test;

    @BeforeEach
    void setUp() {
        test = new LC0383_Ransom_Note();
    }

    @Test
    void test() {
        assertThat(test.canConstruct("a", "b")).isFalse();
        assertThat(test.canConstruct("aa", "ab")).isFalse();
        assertThat(test.canConstruct("aa", "aab")).isTrue();
    }
}
