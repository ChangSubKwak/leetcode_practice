package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2405_Optimal_Partition_of_String_Test {
    @Test
    void exampleTest() {
        LC2405_Optimal_Partition_of_String test = new LC2405_Optimal_Partition_of_String();
        assertThat(test.partitionString("abacaba")).isEqualTo(4);
        assertThat(test.partitionString("ssssss")).isEqualTo(6);
    }
}
