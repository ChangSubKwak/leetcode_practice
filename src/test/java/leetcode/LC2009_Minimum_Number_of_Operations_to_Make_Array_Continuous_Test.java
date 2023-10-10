package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC2009_Minimum_Number_of_Operations_to_Make_Array_Continuous_Test {

    @Test
    void exampleTest() {
        LC2009_Minimum_Number_of_Operations_to_Make_Array_Continuous test = new LC2009_Minimum_Number_of_Operations_to_Make_Array_Continuous();
        
        assertThat(test.minOperations(new int[]{4, 2, 5, 3})).isEqualTo(0);
        assertThat(test.minOperations(new int[]{1, 2, 3, 5, 6})).isEqualTo(1);
        assertThat(test.minOperations(new int[]{1, 10, 100, 1000})).isEqualTo(3);
    }
}
