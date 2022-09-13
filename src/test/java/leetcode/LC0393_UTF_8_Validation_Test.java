package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0393_UTF_8_Validation_Test {
    LC0393_UTF_8_Validation test;

    @BeforeEach
    void setUp() {
        test = new LC0393_UTF_8_Validation();
    }

    @Test
    void test() {
        assertThat(test.validUtf8(new int[]{197, 130, 1})).isTrue();
        assertThat(test.validUtf8(new int[]{235, 140, 4})).isFalse();
    }
}
