package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC2369_Check_if_There_is_a_Valid_Partition_For_The_Array_Test {

    @Test
    void exampleTest() {
        LC2369_Check_if_There_is_a_Valid_Partition_For_The_Array test = new LC2369_Check_if_There_is_a_Valid_Partition_For_The_Array();

        assertThat(test.validPartition(new int[]{4, 4, 4, 5, 6})).isEqualTo(true);
        assertThat(test.validPartition(new int[]{1, 1, 1, 2})).isEqualTo(false);

    }
}
