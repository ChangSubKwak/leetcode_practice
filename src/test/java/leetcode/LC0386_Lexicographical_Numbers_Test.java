package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0386_Lexicographical_Numbers_Test {
    LC0386_Lexicographical_Numbers test;

    @BeforeEach
    void setUp() {
        test = new LC0386_Lexicographical_Numbers();
    }

    @Test
    void test() {
        assertThat(test.lexicalOrder(13)).isEqualTo(Arrays.asList(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9));
        assertThat(test.lexicalOrder(2)).isEqualTo(Arrays.asList(1, 2));
    }
}
