package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1689_Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers_Test {
    
    LC1689_Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers test = new LC1689_Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers();

    @Test
    void exampleTest() {
        assertThat(test.minPartitions("32")).isEqualTo(3);
        assertThat(test.minPartitions("82734")).isEqualTo(8);
        assertThat(test.minPartitions("27346209830709182346")).isEqualTo(9);
    }
}
