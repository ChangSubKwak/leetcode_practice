package leetcode;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LC2220_Minimum_Bit_Flips_to_Convert_Number_Test {
    @Test
    void exampleTest() {
        LC2220_Minimum_Bit_Flips_to_Convert_Number test = new LC2220_Minimum_Bit_Flips_to_Convert_Number();

        assertThat(test.minBitFlips(10, 7)).isEqualTo(3);
        assertThat(test.minBitFlips(3, 4)).isEqualTo(3);

    }
}
