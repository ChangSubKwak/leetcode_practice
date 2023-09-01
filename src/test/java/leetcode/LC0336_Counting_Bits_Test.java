package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LC0336_Counting_Bits_Test {
    @Test
    void test() {
        LC0336_Counting_Bits test = new LC0336_Counting_Bits();

        assertThat(test.countBits(2)).isEqualTo(new int[]{0, 1, 1});
        assertThat(test.countBits(5)).isEqualTo(new int[]{0, 1, 1, 2, 1, 2});
    }
}
