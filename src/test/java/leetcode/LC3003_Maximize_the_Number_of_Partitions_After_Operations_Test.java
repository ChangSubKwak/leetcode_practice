package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC3003_Maximize_the_Number_of_Partitions_After_Operations_Test {

    @Test
    void test() {
        LC3003_Maximize_the_Number_of_Partitions_After_Operations test = new LC3003_Maximize_the_Number_of_Partitions_After_Operations();

        assertThat(test.maxPartitionsAfterOperations("accca", 2)).isEqualTo(3);
        assertThat(test.maxPartitionsAfterOperations("aabaab", 3)).isEqualTo(1);
        assertThat(test.maxPartitionsAfterOperations("xxyz", 1)).isEqualTo(4);
    }
}
