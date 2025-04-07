package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0416_Partition_Equal_Subset_Sum_Test {
    LC0416_Partition_Equal_Subset_Sum test;
    
    @BeforeEach
    void setUp() {
        test = new LC0416_Partition_Equal_Subset_Sum();
    }
    
    @Test
    void minimumTotal() {
        assertThat(test.canPartition(new int[]{1, 5, 11, 5})).isEqualTo(true);
        assertThat(test.canPartition(new int[]{1, 2, 3, 5})).isEqualTo(false);
    }
}
