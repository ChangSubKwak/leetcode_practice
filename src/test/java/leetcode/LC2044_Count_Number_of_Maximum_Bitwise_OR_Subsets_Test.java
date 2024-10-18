package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC2044_Count_Number_of_Maximum_Bitwise_OR_Subsets_Test {
    @Test
    void exampleTest() {
        LC2044_Count_Number_of_Maximum_Bitwise_OR_Subsets test = new LC2044_Count_Number_of_Maximum_Bitwise_OR_Subsets();
        assertThat(test.countMaxOrSubsets(new int[]{3, 1})).isEqualTo(2);
        assertThat(test.countMaxOrSubsets(new int[]{2, 2, 2})).isEqualTo(7);
        assertThat(test.countMaxOrSubsets(new int[]{3, 2, 1, 5})).isEqualTo(6);
    }
}
