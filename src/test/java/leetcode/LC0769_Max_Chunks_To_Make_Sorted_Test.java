package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0769_Max_Chunks_To_Make_Sorted_Test {
    @Test
    void test() {
        LC0769_Max_Chunks_To_Make_Sorted test = new LC0769_Max_Chunks_To_Make_Sorted();
        
        assertThat(test.maxChunksToSorted(new int[]{4, 3, 2, 1, 0})).isEqualTo(1);
        assertThat(test.maxChunksToSorted(new int[]{1, 0, 2, 3, 4})).isEqualTo(4);
    }
} 