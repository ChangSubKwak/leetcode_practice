package leetcode;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LC1963_Minimum_Number_of_Swaps_to_Make_the_String_Balanced_Test {
    LC1963_Minimum_Number_of_Swaps_to_Make_the_String_Balanced test = new LC1963_Minimum_Number_of_Swaps_to_Make_the_String_Balanced();

    @Test
    void exampleTest() {
        assertThat(test.minSwap("][][")).isEqualTo(1);
        assertThat(test.minSwap("]]][[[")).isEqualTo(2);
        assertThat(test.minSwap("[]")).isEqualTo(0);
    }
}
